package br.com.procedure.services.impl;

import br.com.procedure.dtos.ProcedureCreateRequest;
import br.com.procedure.dtos.ProcedureResponse;
import br.com.procedure.dtos.ProcedureUpdateRequest;
import br.com.procedure.entities.Procedure;
import br.com.procedure.repository.ProcedureRepository;
import br.com.procedure.services.ProcedureService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.modelmapper.Condition;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
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
    public ResponseEntity<ProcedureResponse> update(ProcedureUpdateRequest procedureUpdateRequest){
        ModelMapper modelMapper = new ModelMapper();

        if(procedureUpdateRequest.getSessions()==null){
            Procedure pro =modelMapper.map(procedureUpdateRequest,Procedure.class);
            pro.setSessions(repository.findById(procedureUpdateRequest.getId()).get().getSessions());
            repository.save(pro);
            ProcedureResponse response = modelMapper.map(pro,ProcedureResponse.class);
            return new ResponseEntity<>(response,HttpStatus.OK);
        }
        repository.save(modelMapper.map(procedureUpdateRequest,Procedure.class));

        ProcedureResponse respose = modelMapper.map(procedureUpdateRequest,ProcedureResponse.class);
        return new ResponseEntity<>(respose,HttpStatus.OK);
    }
    @Override
    public ResponseEntity<ProcedureResponse> findById(String id){
        Procedure procedure= repository.findById(id).get();
        ProcedureResponse procedureResponse = new ModelMapper().map(procedure,ProcedureResponse.class);
        return new ResponseEntity<ProcedureResponse>(procedureResponse,HttpStatus.FOUND);
    }

}
