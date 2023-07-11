package br.com.procedure.dto;

import br.com.procedure.entities.Session;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProcedureRequest {
    private String procedureName;
    private List<Session> sessions;
}
