package com.laptrinhweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/guest")
public interface GuestController {
    @RequestMapping({"","/","/index"})
    public ModelAndView index();
}
