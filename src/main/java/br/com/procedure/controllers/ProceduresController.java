package br.com.procedure.controllers;

import br.com.procedure.entities.Procedures;
import br.com.procedure.services.ProcedureService;
import br.com.procedure.services.impl.ProcedureServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProceduresController {
    @Autowired
    ProcedureService procedureService;
    @Autowired
    ProcedureServiceIMPL procedureServiceIMPL;
    @GetMapping(path = "a")
    public String a(){
        return "a";
    }
    @GetMapping(path = "/hello-world")
    public String aa(){
        return "Hello World";
    }

    @PostMapping(path = "/b")
    public void n(){
        Procedures procedures = new Procedures(1, "aaa");
        procedureService.insert(procedures);
    }
}
