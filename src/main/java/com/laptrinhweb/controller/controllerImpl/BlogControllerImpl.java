package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.BlogController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class BlogControllerImpl extends BaseHomeController implements BlogController {
    @Override
    public ModelAndView blog() {
        modelAndView.setViewName("/guest/blog");
        return modelAndView;
    }
}
