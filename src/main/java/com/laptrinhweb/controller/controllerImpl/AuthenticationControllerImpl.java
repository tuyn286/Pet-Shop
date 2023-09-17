package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.Dto.auth.AuthenticationResponse;
import com.laptrinhweb.controller.AuthenticationController;
import com.laptrinhweb.entity.UserEntity;
import com.laptrinhweb.repository.UserRepo;
import com.laptrinhweb.service.AuthenticationService;
import com.laptrinhweb.Dto.auth.AuthenticationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class AuthenticationControllerImpl extends BaseHomeController implements AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    UserRepo userRepo;

    @Autowired
    RedisTemplate template;
    @Override
    public ModelAndView welcomePage() {
        modelAndView.setViewName("/admin/welcome");
        return modelAndView;
    }
    @Override
    public ModelAndView showLogin() {
        modelAndView.addObject("authenticationRequest",new AuthenticationRequest());
        modelAndView.setViewName("/login-page");
        return modelAndView;
    }
    @Override
    public ModelAndView loginSuccess(AuthenticationRequest authenticationRequest, HttpServletResponse response){
        //Redirect home page
        modelAndView.setView(new RedirectView("/api/v1/auth"));

        //Authentication
        AuthenticationResponse authenticationResponse = authenticationService.authenticate(authenticationRequest);
        System.out.print(authenticationResponse);

        // Create a new HTTP-only cookie containing the JWT
        Cookie jwtCookie = new Cookie("jwtCookie", "Bearer"+authenticationResponse.getToken());
        jwtCookie.setHttpOnly(true);
        jwtCookie.setMaxAge(60);
        jwtCookie.setPath("/"); // Set the cookie path as needed

        // Add the cookie to the response
        response.addCookie(jwtCookie);
        return modelAndView;
    }
}
