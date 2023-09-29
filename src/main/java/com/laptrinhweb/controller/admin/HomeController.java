package com.laptrinhweb.controller.admin;

import com.laptrinhweb.service.OrderService;
import com.laptrinhweb.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/admin")
@Controller
@AllArgsConstructor
public class HomeController {
    private final ProductService productService;
    private final OrderService orderService;
    @RequestMapping({"/home", "", "/"})
    public ModelAndView goHome(){
        System.out.println("Go Home");
        ModelAndView modelAndView=new ModelAndView();
        try {
            modelAndView.addObject("digitalOrderList", orderService.getCount());
            modelAndView.addObject("products", orderService.getCountProduct());
            System.out.println(orderService.getCount().size());
            modelAndView.addObject("productList", productService.getProducts());
        }catch (Exception e){
            e.printStackTrace();
        }
        modelAndView.setViewName("/admin/page/index");
        return modelAndView;
    }

}
