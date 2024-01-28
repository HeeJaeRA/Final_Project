package com.example.demo.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminHomeController {
	
	@GetMapping(value = {"/admin/", "/admin/home", "/admin/main"})
	public String home() {
		return "/admin/home";
	}

}
