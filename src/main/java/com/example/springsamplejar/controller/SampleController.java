package com.example.springsamplejar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class SampleController {

    @GetMapping
    public ResponseEntity<String> welcomeMethod(){
        String msg = "Test Environment";
        if (msg.equalsIgnoreCase("Test Environment")) return new ResponseEntity<>(msg, HttpStatus.OK);
        else return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
