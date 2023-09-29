package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.HomeController;
import com.laptrinhweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeControllerImpl extends BaseHomeController implements HomeController {
    @Autowired
    ProductService productService;
    @Override
    public ModelAndView home() {
        modelAndView.setViewName("/guest/home");
        modelAndView.addObject("listProducts",productService.getAll());
        return modelAndView;
    }
}
