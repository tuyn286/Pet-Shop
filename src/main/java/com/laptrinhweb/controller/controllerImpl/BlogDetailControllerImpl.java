package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.BlogDetailController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class BlogDetailControllerImpl extends BaseHomeController implements BlogDetailController {
    @Override
    public ModelAndView blogDetail() {
        modelAndView.setViewName("/guest/blog-detail");
        return modelAndView;
    }
}
