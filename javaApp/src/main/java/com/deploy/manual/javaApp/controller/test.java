package com.deploy.manual.javaApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/health")
    public String getHealth()
    {
        return "OK";
    }

    @GetMapping("/testing")
    public String getTest()
    {
        return "Test";
    }

}
