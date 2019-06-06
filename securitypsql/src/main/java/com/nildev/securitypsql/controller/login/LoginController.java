package com.nildev.securitypsql.controller.login;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public ModelAndView getLoginPage(@RequestParam Optional<String> error){
		
		return new ModelAndView("login/login", "error", error);
	}
	
	@GetMapping("home")
	@ResponseBody
	public String home() {
		return "HOME";
	}
}
