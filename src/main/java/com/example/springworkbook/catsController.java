package com.example.springworkbook;

import org.springframework.web.bind.annotation.RequestMapping;

public class catsController {

    @RequestMapping("/cats")
    public String displayCat(){
        return "/index";
    }
}
