package com.laptrinhweb.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/service")
public interface ServiceController {
    @RequestMapping({"","/"})
    public ModelAndView service();
}
