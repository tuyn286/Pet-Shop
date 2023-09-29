package com.laptrinhweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/blog-detail")
public interface BlogDetailController {
    @RequestMapping({"","/"})
    public ModelAndView blogDetail();
}
