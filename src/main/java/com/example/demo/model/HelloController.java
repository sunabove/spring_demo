package com.example.demo.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

	@RequestMapping("/hello.html")
	public String hello() {
		return "hello.html";
	}
	
}
