package br.com.procedure.dtos;

import br.com.procedure.entities.Session;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcedureUpdateRequest {
    private String id;
    private String procedureName;
    private List<SessionUpdateRequest> sessions;
}
