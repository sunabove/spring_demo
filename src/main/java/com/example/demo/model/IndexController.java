package com.example.demo.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/")
public class IndexController {
	@RequestMapping("/index.html")
	public String index(Model model, @RequestParam(value = "name", defaultValue = "World") String name) {
		
		model.addAttribute("result", true);
		
		return "index.html";
	}
}
