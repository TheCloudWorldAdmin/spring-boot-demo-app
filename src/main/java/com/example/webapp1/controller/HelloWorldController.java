package com.example.webapp1.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Best project to practise DevOps methodology \n"
			+
			"\n"
			+
			"updated v4.0"
			+
			"\n";
	}

}
