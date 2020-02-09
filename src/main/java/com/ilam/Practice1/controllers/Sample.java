package com.ilam.Practice1.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Sample {
    @GetMapping
    public String getVersion() {
        return "version-1 beta";
    }
}
