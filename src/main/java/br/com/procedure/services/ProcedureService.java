package br.com.procedure.services;

import br.com.procedure.dtos.ProcedureCreateRequest;
import br.com.procedure.dtos.ProcedureResponse;
import br.com.procedure.dtos.ProcedureUpdateRequest;
import br.com.procedure.entities.Procedure;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProcedureService{
    public ProcedureResponse create(ProcedureCreateRequest procedureRequest);

    public ProcedureResponse findById(String id);

    public ProcedureResponse update(ProcedureUpdateRequest procedure);

    public void delete(String id);

    List<Procedure> findAllProcedures();

}
