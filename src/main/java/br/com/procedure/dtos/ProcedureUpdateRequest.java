package br.com.procedure.dtos;

import br.com.procedure.entities.Session;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class ProcedureUpdateRequest {
    private String id;
    private String procedureName;
    private List<Session> sessions;

    public ProcedureUpdateRequest() {
    }

    public ProcedureUpdateRequest(String id, String procedureName) {
        this.id = id;
        this.procedureName = procedureName;
    }

    public ProcedureUpdateRequest(String id, String procedureName, List<Session> sessions) {
        this.id = id;
        this.procedureName = procedureName;
        this.sessions = sessions;
    }
}
