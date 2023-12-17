package com.Kartikey.SpringBootWithSwagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1")
public class RestController {

    @GetMapping("/name") //This api will return the name of the book
    public String bookName(){
        return "Clean Code";
    }

}
