package com.laptrinhweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/about")
public interface AboutController {
    @RequestMapping({"","/"})
    public ModelAndView about();
}
