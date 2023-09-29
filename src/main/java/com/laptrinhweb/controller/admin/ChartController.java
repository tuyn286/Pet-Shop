package com.laptrinhweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/admin/charts")
@Controller
public class ChartController {
    @RequestMapping({"","/"})
    public ModelAndView goChart(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/admin/page/charts");
        return modelAndView;
    }
}
