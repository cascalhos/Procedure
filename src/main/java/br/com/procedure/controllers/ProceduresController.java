package br.com.procedure.controllers;

import br.com.procedure.dtos.ProcedureCreateRequest;
import br.com.procedure.dtos.ProcedureResponse;
import br.com.procedure.entities.Procedure;
import br.com.procedure.services.ProcedureService;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "Create a Procedure")
    public ResponseEntity<ProcedureResponse> create(@RequestBody ProcedureCreateRequest procedureRequest){
        return procedureService.create(procedureRequest);
    }
    @GetMapping(path = "/{id}")//funcionando
    @Operation(summary = "Find a Procedure by Id")
    public ResponseEntity<ProcedureResponse> findById(@PathVariable("id") String id){
        return procedureService.findById(id);
    }
    @PutMapping(path = "/{id}")
    @Operation(summary = "Update a Procedure")
    public ResponseEntity update(@RequestBody Procedure procedure){
        return  procedureService.update(procedure);
    }
    @DeleteMapping(path = "/{id}")//funcionando
    @Operation(summary = "Delete a Procedure by Id")
    public void delete(@PathVariable("id") String id){
        procedureService.delete(id);
    }
    @GetMapping
    @Operation(summary = "Get all Procedures available")
    public ResponseEntity<List<Procedure>> findAllProcedures(){//funcionando
        List<Procedure> listProcedures = procedureService.findAllProcedures();
        return ResponseEntity.ok(listProcedures);
    }

}
