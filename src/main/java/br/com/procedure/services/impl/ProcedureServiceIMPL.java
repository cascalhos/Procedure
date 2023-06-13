package br.com.procedure.services.impl;

import br.com.procedure.entities.Procedure;
import br.com.procedure.repository.ProcedureRepository;
import br.com.procedure.services.ProcedureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service("procedureService")
public class ProcedureServiceIMPL implements ProcedureService {
    private final ProcedureRepository repository;
    @Override
    public void create(Procedure procedure){
        repository.insert(procedure);
    }
    @Override
    public void delete(Integer id){
        repository.deleteById(id);
    }
    @Override
    public ResponseEntity<String> update(Procedure procedure){
        if(repository.findById(procedure.getId()).isPresent()){
            repository.save(procedure);
            return ResponseEntity.ok("updated");
        }
        return ResponseEntity.of(Optional.of("error"));
    }
    @Override
    public Procedure findById(Integer id){
        return repository.findById(id).isPresent()?repository.findById(id).get():null;
    }

}
