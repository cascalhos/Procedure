package br.com.procedure.dtos;

import br.com.procedure.entities.Session;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProcedureResponse {
    private String id;
    private String procedureName;
    private List<Session> sessions;

    public ProcedureResponse(String id, String procedureName) {
        this.id = id;
        this.procedureName = procedureName;
    }
}
