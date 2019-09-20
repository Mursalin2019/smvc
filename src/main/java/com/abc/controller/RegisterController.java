package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.dto.RegisterDto;

@Controller
public class RegisterController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView getDriverPage() {
		System.out.println("I am inside ragister controller");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register");
		RegisterDto registerDto = new RegisterDto();
		mv.addObject("registerObject", registerDto);
		return mv;
	}

	@RequestMapping(value = "/register-process", method = RequestMethod.POST)
	public String processLogin(RegisterDto dto) {
		System.out.println("registerform values : " + dto.toString());
		return "registersuceess";

	}

}