package com.pccoe.pccoe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HELLO {

    @GetMapping("/hello")
    public String hello()
    {
        return "hello pccoe";
    }
}
