package br.com.procedure.repository;

import br.com.procedure.entities.Procedure;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProcedureRepository extends MongoRepository<Procedure, String> {

}
