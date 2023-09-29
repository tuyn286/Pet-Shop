package com.laptrinhweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/team")
public interface TeamController {
    @RequestMapping({"","/"})
    public ModelAndView team();
}
