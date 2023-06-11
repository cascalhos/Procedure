package br.com.procedure.repository;

import br.com.procedure.entities.Procedures;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProcedureRepository extends MongoRepository<Procedures, Integer> {

}
