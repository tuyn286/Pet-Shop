package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.GuestController;
import com.laptrinhweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class GuestControllerImpl extends BaseHomeController implements GuestController {
    @Autowired
    private UserService userService;
    @Override
    public ModelAndView index() {
        modelAndView.setViewName("/guest/index");
        modelAndView.addObject("listUser",userService.getAll());
        System.out.print(userService.getAll());
        return modelAndView;
    }
}
