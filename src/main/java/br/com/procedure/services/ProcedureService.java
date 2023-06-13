package br.com.procedure.services;

import br.com.procedure.entities.Procedure;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProcedureService{
    public void create(Procedure procedures);

    public Procedure findById(String id);

    public ResponseEntity update(Procedure procedure);

    public void delete(String id);

    List<Procedure> findAllProcedures();

}
