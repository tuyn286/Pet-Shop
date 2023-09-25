package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.ProductController;
import com.laptrinhweb.entity.ProductEntity;
import com.laptrinhweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ProductControllerImpl extends BaseHomeController implements ProductController {
    @Autowired
    ProductService productService;
    @Override
    public ModelAndView product() {
        modelAndView.setViewName("/guest/product");
        List<ProductEntity> list = productService.getAll();
        modelAndView.addObject("listProducts",list);
        return modelAndView;
    }
}
