package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("test")
public class TestController {

	@GetMapping("/")
	public String index() {
		return "home";
	}

    @GetMapping("/login")
	public String login() {
		return "login";
	}
    
    @GetMapping("/prueba")
	public String prueba() {
		return "prueba";
	}


}
