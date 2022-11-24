package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {
	
	@RequestMapping("/fortune")
	public String start() {
		double a = Math.random();
		if(a>0.8) {
			return "greatFortune.html";
		}
		else if (a > 0.4) {
			return "goodFortune.html";	
		} else {
			return "misFortune.html";
		}
	}

}
