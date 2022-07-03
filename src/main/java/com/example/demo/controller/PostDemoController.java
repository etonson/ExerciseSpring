package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;

@RestController
public class PostDemoController {
	@PostMapping("/hello")
	public ModelAndView mo(@RequestParam("name") String name,
            @RequestParam("pwd") String pwd) {
		User user = new User();
		user.setName(name);
		user.setPwd(pwd);
		ModelAndView modelAndView = new ModelAndView("form");
		modelAndView.addObject("user", user);
		System.out.println("name"+name+"  pwd"+pwd);
		return modelAndView;
	}
}
