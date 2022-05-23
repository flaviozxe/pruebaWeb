package org.ciberfarma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ProductoController {
	
	@GetMapping("saludo")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		model.addAttribute("name", name);
		
		return "saludito";
	}
	@PostMapping("/saludo")
	public String greetingform(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		model.addAttribute("name", name);
		
		return "saludito";
	}
	
}
