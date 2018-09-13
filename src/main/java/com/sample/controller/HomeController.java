package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.service.LoginService;

@Controller
public class HomeController {

	private @Autowired LoginService loginService;

	@RequestMapping("/")
	public String viewHome() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String userName, @RequestParam String password) {
		boolean isValidUser = loginService.validateUser(userName, password);
		if (!isValidUser) {
			return "index";
		}
		return "welcome";
	}
}
