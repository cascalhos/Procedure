package br.com.procedure.services.impl;

import br.com.procedure.entities.Procedures;
import br.com.procedure.repository.ProcedureRepository;
import br.com.procedure.services.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("procedureService")
public class ProcedureServiceIMPL implements ProcedureService {
    @Autowired
    ProcedureRepository procedureRepository;
    public void insert(Procedures procedures){
        procedureRepository.insert(procedures);
    }
}
