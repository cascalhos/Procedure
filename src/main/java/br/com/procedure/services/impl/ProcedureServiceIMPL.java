package br.com.procedure.services.impl;

import br.com.procedure.dtos.*;
import br.com.procedure.entities.Procedure;
import br.com.procedure.repository.ProcedureRepository;
import br.com.procedure.services.ProcedureService;
import jakarta.validation.ValidationException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.Condition;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service("procedureService")
public class ProcedureServiceIMPL implements ProcedureService {
    private final ProcedureRepository repository;

    private final ModelMapper modelMapper;
    private final ArrayList<ProcedureResponse> procedureResponseList;
    @Override
    public ProcedureResponse create(ProcedureCreateRequest procedureRequest){
        try {
            Procedure procedure = modelMapper.map(procedureRequest, Procedure.class);
            repository.insert(procedure);
            ProcedureResponse procedureResponse = modelMapper.map(procedure, ProcedureResponse.class);
            return procedureResponse;
        }
        catch (Exception e){
            throw new ValidationException(e);
        }
    }
    @Override
    public void delete(String id){
        repository.deleteById(id);
    }

    @Override
    public List<ProcedureResponse> findAllProcedures() {
        try{
            return repository.findAll().stream().map(x->modelMapper.map(x,ProcedureResponse.class)).collect(Collectors.toList());
        }
        catch (Exception e){
            throw new ValidationException(e);
        }
    }

    @Override
    public ProcedureResponse update(ProcedureUpdateRequest procedureUpdateRequest){
        try {
            modelMapper.getConfiguration().setSkipNullEnabled(true).setDeepCopyEnabled(true);
            Procedure procedure = repository.findById(procedureUpdateRequest.getId()).orElseThrow(()->new ValidationException("Procedure not found"));
            if(procedureUpdateRequest.getSessions()!=null){
                procedure.setSessions(null);
            }
            modelMapper.map(procedureUpdateRequest,procedure);
            repository.save(procedure);
            return modelMapper.map(procedure,                                                                                                                                                           ProcedureResponse.class);
        }
        catch (Exception e){
            throw new ValidationException(e);
        }
    }
    @Override
    public ProcedureResponse findById(String id){
        try {
            Procedure procedure= repository.findById(id).orElseThrow(()-> new ValidationException("Procedure not found"));
            ProcedureResponse procedureResponse = modelMapper.map(procedure,ProcedureResponse.class);
            return procedureResponse;
        }
        catch (Exception e){
            throw new ValidationException(e);
        }
    }

}
