package com.laptrinhweb.controller;

import com.laptrinhweb.Dto.auth.AuthenticationRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@RequestMapping("/auth")
    public interface AuthenticationController {
    @RequestMapping("/login-page")
    public ModelAndView showLogin();
    @PostMapping("/login")
    public ModelAndView loginSuccess(@ModelAttribute(name = "authenticationRequest") AuthenticationRequest authenticationRequest, HttpServletResponse response);
}
