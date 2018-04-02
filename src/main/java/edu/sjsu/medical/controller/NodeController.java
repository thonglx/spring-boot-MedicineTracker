package edu.sjsu.medical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NodeController{

	@GetMapping({"/node"})
    public String home(Model model) {
        model.addAttribute("title", "Node Name");
        return "nodeController";
    }
}
