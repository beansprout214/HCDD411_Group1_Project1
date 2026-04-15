package psu.edu.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping("/")
	public String showHome() {
//		return "redirect:/employees/list";
		return "redirect:/showMyLoginPage";
	}
}
