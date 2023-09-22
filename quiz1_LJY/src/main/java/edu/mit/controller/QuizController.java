package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/quiz/**")
public class QuizController {
	
	@GetMapping("/quiz1")
	public void quiz1(Model m) {
		m.addAttribute("quiz1","오늘은 금요일");
		
	}
	

}
