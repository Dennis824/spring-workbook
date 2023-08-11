package com.example.springworkbook.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class WorkbookController {

    @GetMapping("/")
   public String getSign(Model model){
        model.addAttribute("speed", 45);
        return "index";
    }
}
