package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//매핑 여러개
	@GetMapping(value = {"/", "/home", "/main"})
	public String home() {
		return "/user/home";
	}
}
