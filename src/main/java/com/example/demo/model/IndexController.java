package com.example.demo.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
	@RequestMapping("/index.html")
	public String index() {
		return "index.html";
	}
}
