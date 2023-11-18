package br.com.procedure.services.impl;

import br.com.procedure.dtos.ProcedureCreateRequest;
import br.com.procedure.dtos.ProcedureResponse;
import br.com.procedure.dtos.ProcedureUpdateRequest;
import br.com.procedure.entities.Procedure;
import br.com.procedure.repository.ProcedureRepository;
import br.com.procedure.services.ProcedureService;
import jakarta.validation.ValidationException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("procedureService")
public class ProcedureServiceIMPL implements ProcedureService {
    private final ProcedureRepository repository;

    private final ModelMapper modelMapper;
    @Override
    public ProcedureResponse create(ProcedureCreateRequest procedureRequest){
        Procedure procedure = modelMapper.map(procedureRequest,Procedure.class);
        repository.insert(procedure);
        ProcedureResponse procedureResponse = modelMapper.map(procedure,ProcedureResponse.class);
        return procedureResponse;

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
    public ProcedureResponse update(ProcedureUpdateRequest procedureUpdateRequest){
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        Procedure procedure = repository.findById(procedureUpdateRequest.getId()).orElseThrow(()->new ValidationException("Procedure not found"));
        modelMapper.map(procedureUpdateRequest,procedure);
        repository.save(procedure);
        return modelMapper.map(procedure,ProcedureResponse.class);
    }
    @Override
    public ProcedureResponse findById(String id){
        Procedure procedure= repository.findById(id).get();
        ProcedureResponse procedureResponse = new ModelMapper().map(procedure,ProcedureResponse.class);
        return procedureResponse;
    }

}
