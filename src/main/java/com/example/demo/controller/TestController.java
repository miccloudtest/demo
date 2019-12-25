package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controller")
public class TestController {
    @GetMapping("getmessage")
    public String getTestMsg()
    {
        return "Message received from  Kalu Kaka ";
    }
}
