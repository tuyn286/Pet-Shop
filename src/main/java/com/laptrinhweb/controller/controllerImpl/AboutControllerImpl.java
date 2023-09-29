package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.AboutController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class AboutControllerImpl extends BaseHomeController implements AboutController {
    @Override
    public ModelAndView about() {
        modelAndView.setViewName("/guest/about");
        return modelAndView;
    }
}
