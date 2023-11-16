package br.com.procedure.services.impl;

import br.com.procedure.dtos.ProcedureCreateRequest;
import br.com.procedure.dtos.ProcedureResponse;
import br.com.procedure.entities.Procedure;
import br.com.procedure.repository.ProcedureRepository;
import br.com.procedure.services.ProcedureService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("procedureService")
public class ProcedureServiceIMPL implements ProcedureService {
    private final ProcedureRepository repository;
    @Override
    public ResponseEntity<ProcedureResponse> create(ProcedureCreateRequest procedureRequest){
        ModelMapper modelMapper = new ModelMapper();
        Procedure procedure = modelMapper.map(procedureRequest,Procedure.class);
        repository.insert(procedure);
        ProcedureResponse procedureResponse = modelMapper.map(procedure,ProcedureResponse.class);
        return new ResponseEntity<>(procedureResponse, HttpStatus.CREATED);

    }
    @Override
    public void delete(String id){
        repository.deleteById(id);
    }

    @Override
    public List<Procedure> findAllProcedures() {
        return repository.findAll();
    }

    @Override
    public ResponseEntity<String> update(Procedure procedure){
        return ResponseEntity.of(Optional.of("error"));
    }
    @Override
    public ResponseEntity<ProcedureResponse> findById(String id){
        Procedure procedure= repository.findById(id).get();
        ProcedureResponse procedureResponse = new ModelMapper().map(procedure,ProcedureResponse.class);
        return new ResponseEntity<ProcedureResponse>(procedureResponse,HttpStatus.FOUND);
    }

}
