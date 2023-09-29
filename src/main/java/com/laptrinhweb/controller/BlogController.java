package com.laptrinhweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/blog")
public interface BlogController {
    @RequestMapping({"","/"})
    public ModelAndView blog();
}
