package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.ServiceController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class ServiceControllerImpl extends BaseHomeController implements ServiceController {
    @Override
    public ModelAndView service() {
        modelAndView.setViewName("/guest/service");
        return modelAndView;
    }
}
