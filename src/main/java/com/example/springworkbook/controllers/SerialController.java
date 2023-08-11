package com.example.springworkbook.controllers;

import com.example.springworkbook.models.Serial;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SerialController {

    @GetMapping("/")
    public ModelAndView getShow(){
        Map<String, Serial> model  = new HashMap<>();
        model.put("first", new Serial("Braking bad", "Ozymandias", 10.0));
        model.put("second", new Serial("mr Robot", "407", 8.7));
    return new ModelAndView("index", model);
    }
}
