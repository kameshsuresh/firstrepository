package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class admin {
	@GetMapping("/")
	public String home() {
		
		return "index";
	}
}
