package br.com.procedure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProceduresController {

    @GetMapping(path = "/hello-world")
    public String aa(){
        return "Hello World";
    }
}
