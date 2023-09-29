package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.TestimonialController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class TestimonialControllerImpl extends BaseHomeController implements TestimonialController {
    @Override
    public ModelAndView testimonial() {
        modelAndView.setViewName("/guest/testimonial");
        return modelAndView;
    }
}
