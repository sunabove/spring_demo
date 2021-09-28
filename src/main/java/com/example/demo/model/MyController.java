package com.example.demo.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
	@RequestMapping("/myHello.html")
	public String hello(Model model, @RequestParam(value = "name", defaultValue = "World") String name) {
		var tasks = java.util.Arrays.asList("a", "b", "c", "d", "e", "f", "g");
		model.addAttribute("myData", "Good Morning!");
		model.addAttribute("name", name);
		model.addAttribute("tasks", tasks);
		
		return "myHello.html";
	}
}
