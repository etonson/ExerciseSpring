package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;
/**
 * Author:   longzhonghua
 * Date:     3/22/2019 10:42 AM
 */
@Controller
public class MVCDemoController {
    @GetMapping("/login")
    public ModelAndView hello() {
        User user=new User();
        user.setName("zhonghua");
        user.setPwd("zhonghua");
        ModelAndView modelAndView=new ModelAndView("form");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
