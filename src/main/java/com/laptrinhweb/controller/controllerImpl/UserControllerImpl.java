package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.controller.UserController;
import com.laptrinhweb.entity.UserEntity;
import com.laptrinhweb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserControllerImpl extends BaseHomeController implements UserController {
    @Autowired
    private RedisTemplate template;

    @Autowired
    private UserRepo userRepo;
    @Override
    public ModelAndView home() {
        modelAndView.setViewName("/user/index");
        return modelAndView;
    }

    @Override
    public ModelAndView about() {
        modelAndView.setViewName("/user/about");
        return modelAndView;
    }

    @Override
    public ModelAndView service() {
        modelAndView.setViewName("/user/service");
        return modelAndView;
    }

    @Override
    public ModelAndView product() {
        modelAndView.setViewName("/user/product");
        return modelAndView;
    }

    @Override
    public ModelAndView price() {
        modelAndView.setViewName("/user/price");
        return modelAndView;
    }

    @Override
    public ModelAndView team() {
        modelAndView.setViewName("/user/team");
        return modelAndView;
    }

    @Override
    public ModelAndView testimonial() {
        modelAndView.setViewName("/user/testimonial");
        return modelAndView;
    }

    @Override
    public ModelAndView blog() {
        modelAndView.setViewName("/user/blog");
        return modelAndView;
    }

    @Override
    public ModelAndView blogDetail() {
        modelAndView.setViewName("/user/blog-detail");
        return modelAndView;
    }

    @Override
    public ModelAndView contact() {
        modelAndView.setViewName("/user/contact");
        return modelAndView;
    }
}
