package com.laptrinhweb.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.nio.file.AccessDeniedException;

@ControllerAdvice

public class SecurityExceptionHandler extends ResponseEntityExceptionHandler {
    ModelAndView modelAndView =new ModelAndView();

    @ExceptionHandler({ Exception.class,AccessDeniedException.class})
    public ModelAndView handleNotFoundException(Exception ex, WebRequest request){
        modelAndView.setViewName("/exception/404");
        modelAndView.addObject("message", ex.getMessage());
        return modelAndView;
    }




}
