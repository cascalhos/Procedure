package br.com.procedure.dtos;

import br.com.procedure.entities.Session;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class ProcedureCreateRequest {
    private String procedureName;
    private List<SessionCreateRequest> sessions;
}
