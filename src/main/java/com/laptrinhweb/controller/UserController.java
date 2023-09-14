package com.laptrinhweb.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/user")
public interface UserController {
    @RequestMapping({"","/","/home"})
//    @PreAuthorize("hasRole('ROLE_USER')")
    public ModelAndView home();
    @RequestMapping("/about")
    public ModelAndView about();
    @RequestMapping("service")
    public ModelAndView service();
    @RequestMapping("product")
    public ModelAndView product();
    @RequestMapping("price")
    public ModelAndView price();
    @RequestMapping("team")
    public ModelAndView team();
    @RequestMapping("testimonial")
    public ModelAndView testimonial();
    @RequestMapping("blog")
    public ModelAndView blog();
    @RequestMapping("blog-detail")
    public ModelAndView blogDetail();
    @RequestMapping("contact")
    public ModelAndView contact();

}
