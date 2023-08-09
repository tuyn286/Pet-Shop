package com.laptrinhweb.Controller;

import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;

public class BaseHomeController {
    protected ModelAndView modelAndView;
    @PostConstruct
    private void initModelAndView(){
        modelAndView = new ModelAndView();
    }
}
