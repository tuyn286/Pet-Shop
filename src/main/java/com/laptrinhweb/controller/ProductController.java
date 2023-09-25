package com.laptrinhweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/product")
public interface ProductController {
    @RequestMapping({"","/"})
    public ModelAndView product();
}
