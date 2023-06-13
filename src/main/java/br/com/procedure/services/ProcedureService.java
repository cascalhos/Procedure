package br.com.procedure.services;

import br.com.procedure.entities.Procedure;
import org.springframework.http.ResponseEntity;

public interface ProcedureService{
    public void create(Procedure procedures);

    public Procedure findById(Integer id);

    public ResponseEntity update(Procedure procedure);

    public void delete(Integer id);

}
