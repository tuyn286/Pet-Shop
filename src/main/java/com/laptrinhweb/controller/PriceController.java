package com.laptrinhweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("/price")
public interface PriceController {
    @RequestMapping({"","/"})
    public ModelAndView price();
}
