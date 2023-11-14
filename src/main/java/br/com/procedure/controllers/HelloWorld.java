package br.com.procedure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class HelloWorld {
    @GetMapping(path = "/hello-world")
    public String helloWord(){
        return "Hello World";
    }
}
