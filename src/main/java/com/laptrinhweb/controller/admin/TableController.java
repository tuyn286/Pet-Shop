package com.laptrinhweb.controller.admin;

import com.laptrinhweb.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/admin/tables")
@Controller
@RequiredArgsConstructor
public class TableController {
    private final ProductService productService;
    @RequestMapping({"","/"})
    public ModelAndView goChart(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("productList", productService.getProducts());
        modelAndView.setViewName("/admin/page/table");
        return modelAndView;
    }
}
