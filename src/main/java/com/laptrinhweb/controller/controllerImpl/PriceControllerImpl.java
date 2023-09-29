package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.PriceController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class PriceControllerImpl extends BaseHomeController implements PriceController {
    @Override
    public ModelAndView price() {
        modelAndView.setViewName("/guest/price");
        return modelAndView;
    }
}
