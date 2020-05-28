package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author verhage
 */
@RestController
@RequestMapping("/")
public class HelloWorld {
    @GetMapping
    public String hello() {
        return "<h1>Hello world!</h1>";
    }
}
