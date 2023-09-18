package com.laptrinhweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/home")
public interface HomeController {
    @RequestMapping({"","/"})
    public ModelAndView home();
}
