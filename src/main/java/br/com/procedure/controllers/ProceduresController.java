package br.com.procedure.controllers;

import br.com.procedure.dtos.ProcedureCreateRequest;
import br.com.procedure.dtos.ProcedureResponse;
import br.com.procedure.dtos.ProcedureUpdateRequest;
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
    @PostMapping
    @Operation(summary = "Create a Procedure")
    public ProcedureResponse create(@RequestBody ProcedureCreateRequest procedureRequest){
        return procedureService.create(procedureRequest);
    }
    @GetMapping(path = "/{id}")
    @Operation(summary = "Find a Procedure by Id")
    public ProcedureResponse findById(@PathVariable("id") String id){
        return procedureService.findById(id);
    }
    @PutMapping
    @Operation(summary = "Update a Procedure")
    public ProcedureResponse update(@RequestBody ProcedureUpdateRequest procedure){
        return  procedureService.update(procedure);
    }
    @DeleteMapping(path = "/{id}")
    @Operation(summary = "Delete a Procedure by Id")
    public void delete(@PathVariable("id") String id){
        procedureService.delete(id);
    }
    @GetMapping
    @Operation(summary = "Get all Procedures available")
    public List<ProcedureResponse> findAllProcedures(){
        return procedureService.findAllProcedures();
    }

}
