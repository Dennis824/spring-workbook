package com.example.springworkbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SerialController {

    @RequestMapping("/show")
    public String getShow(){
    return "/index";
    }
}
