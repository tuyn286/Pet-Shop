package com.laptrinhweb.controller;

import com.laptrinhweb.Dto.MessageDto;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/contact")
public interface ContactController {
    @RequestMapping({"/",""})
    public ModelAndView contact();

    @RequestMapping("/send-message")
    public ModelAndView sendMessage(@ModelAttribute MessageDto messageDto);
}
