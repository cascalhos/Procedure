package br.com.procedure.dtos;

import br.com.procedure.entities.Session;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
@Getter
@Setter

public class ProcedureResponse {
    private String id;
    private String procedureName;
    private List<Session> sessions;
}
