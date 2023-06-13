package br.com.procedure.controllers;

import br.com.procedure.entities.Procedure;
import br.com.procedure.services.ProcedureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class ProceduresController {

    private final ProcedureService procedureService;
    @GetMapping(path = "/hello-world")
    public String helloWord(){
        return "Hello World";
    }
    @PostMapping(path = "/create")
    public void create(@RequestBody Procedure procedure){
        procedureService.create(procedure);
    }
    @GetMapping(path = "/find/{id}")
    public Procedure findById(@PathVariable("id") Integer id){
        return procedureService.findById(id);
    }
    @PutMapping(path = "/update")
    public ResponseEntity update(@RequestBody Procedure procedure){
        return  procedureService.update(procedure);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        procedureService.delete(id);
    }

}
