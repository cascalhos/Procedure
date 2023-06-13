package br.com.procedure.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Procedure {
    @MongoId
    @Indexed(unique = true)
    private String id;
    @Indexed(unique = true)
    private String procedureName;
    private List<Session> sessions;

    public Procedure(String procedureName, List<Session> sessions) {
        this.procedureName = procedureName;
        this.sessions = sessions;
    }

}
