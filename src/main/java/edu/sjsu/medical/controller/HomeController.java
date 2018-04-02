package edu.sjsu.medical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
	@GetMapping({"/","mainMenu"})
    public String home(Model model) {
        model.addAttribute("title", "Main Menu");
        return "mainMenu";

    }
}
