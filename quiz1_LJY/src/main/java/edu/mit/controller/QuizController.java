package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mit.dao.TwoVO;
import edu.mit.service.QuizService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Controller
@RequestMapping("/quiz/**")
@Log4j
@AllArgsConstructor
public class QuizController {
	
	
	private QuizService service;
	
	@GetMapping("quiz1")
	public void quiz1(Model m) {
		m.addAttribute("quiz1","오늘은 금요일");
		
	}
	
	@GetMapping("/quiz2")
	public void quiz2() {
		
	}
	
	@PostMapping("/quiz2")
	public String quiz2_1(TwoVO vo,Model m) {
		log.info("수집된 내용 :: !! " +vo);
		
		m.addAttribute("sum",service.allsum(vo));
		return ("quiz/result");
		
	}
	

}
