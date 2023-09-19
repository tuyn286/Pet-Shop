package com.laptrinhweb.controller.admin;

import com.laptrinhweb.controller.controllerImpl.BaseHomeController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class HomeController extends BaseHomeController {
    @RequestMapping("/home")
    public ModelAndView goHome(){
        modelAndView.setViewName("/admin/page/index");
        return modelAndView;
    }
}
