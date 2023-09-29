package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.TeamController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class TeamControllerImpl extends BaseHomeController implements TeamController {
    @Override
    public ModelAndView team() {
        modelAndView.setViewName("/guest/team");
        return modelAndView;
    }
}
