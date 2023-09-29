package com.laptrinhweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/testimonial")
public interface TestimonialController {
    @RequestMapping({"","/"})
    public ModelAndView testimonial();
}
