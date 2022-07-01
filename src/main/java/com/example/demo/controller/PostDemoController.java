package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;

public class PostDemoController {
    @GetMapping("/momo")
    public ModelAndView mo() {
        //实例化对象
        User user=new User();
        user.setName("r");
        user.setPwd("");
        //定义mvc中的视图模板
        ModelAndView modelAndView=new ModelAndView("form");
        //传递user实体对象给视图
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
