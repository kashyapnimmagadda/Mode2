package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.main.model.User;

@Controller
public class LoginController {
	@GetMapping("/loginPage")
	public ModelAndView loginPage(@ModelAttribute User user) {
		return new ModelAndView("login");
	}
	@GetMapping("/successPage")
	public ModelAndView successPage(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	@GetMapping("/registerPage")
	public ModelAndView registerPage() {
		return new ModelAndView("register");
	}

}
