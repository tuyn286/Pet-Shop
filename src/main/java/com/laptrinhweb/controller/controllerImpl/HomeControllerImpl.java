package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.HomeController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeControllerImpl extends BaseHomeController implements HomeController {
    @Override
    public ModelAndView home() {
        modelAndView.setViewName("/guest/home");

        return modelAndView;
    }
}
