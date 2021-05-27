package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping()
    public String welcome(){
        return "Welcome to the world";
    }

    @GetMapping(value="/secure/{name}")
    public String helloNameSecure(@PathVariable("name") String name) {
        return "Hello world " + name;
    }

    @GetMapping(value="/open/{name}")
    public String helloNameOpen(@PathVariable("name") String name) {
        return "Hello world " + name;
    }
}
