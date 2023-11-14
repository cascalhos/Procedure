package br.com.procedure.controllers;

import br.com.procedure.entities.Procedure;
import br.com.procedure.services.ProcedureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("procedures")
public class ProceduresController {

    private final ProcedureService procedureService;
    @PostMapping//funcionando
    public void create(@RequestBody Procedure procedure){
        procedureService.create(procedure);
    }
    @GetMapping(path = "/{id}")//funcionando
    public Procedure findById(@PathVariable("id") String id){
        return procedureService.findById(id);
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity update(@RequestBody Procedure procedure){
        return  procedureService.update(procedure);
    }
    @DeleteMapping(path = "/{id}")//funcionando
    public void delete(@PathVariable("id") String id){
        procedureService.delete(id);
    }
    @GetMapping
    public ResponseEntity<List<Procedure>> findAllProcedures(){//funcionando
        List<Procedure> listProcedures = procedureService.findAllProcedures();
        return ResponseEntity.ok(listProcedures);
    }

}
