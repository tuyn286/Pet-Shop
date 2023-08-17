package com.laptrinhweb.controller;

import com.laptrinhweb.Dto.auth.AuthenticationRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@RequestMapping("api/v1/auth")
    public interface AuthenticationController {
    @RequestMapping({"/",""})
    public ModelAndView welcomePage();
    @RequestMapping("/login-page")
    public ModelAndView showLogin();
    @PostMapping("/login")
    public ModelAndView loginSuccess(@ModelAttribute(name = "authenticationRequest") AuthenticationRequest authenticationRequest, HttpServletResponse response);
}