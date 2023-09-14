package com.laptrinhweb.controller;

import com.laptrinhweb.Dto.auth.AuthenticationResponse;
import com.laptrinhweb.Dto.auth.AuthenticationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;

@RequestMapping("api/v1/auth")
public interface HomeController {
    @RequestMapping({"/",""})
    public ModelAndView welcomePage();
    @RequestMapping("/login-page")
    public ModelAndView showLogin();
    @PostMapping("/login")
    public ModelAndView loginSuccess(@ModelAttribute(name = "authenticationRequest") AuthenticationRequest authenticationRequest, HttpServletResponse response);
}
