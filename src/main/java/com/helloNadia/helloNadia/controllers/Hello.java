package com.helloNadia.helloNadia.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class Hello {

//salamm

    @GetMapping("/nadia_outizi")
    public String working(){
        return "nadia from marrakech";
    }
}
