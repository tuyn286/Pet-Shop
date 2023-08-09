package com.laptrinhweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController extends BaseHomeController{
    @RequestMapping({"/","/home"})
    public ModelAndView welcomePage() {
        System.out.print("welcome");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }
}
