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
    private Integer id;
    @Indexed(unique = true)
    private String procedureName;
    private List<Session> sessions;

    public Procedure(Integer id, String procedureName) {
        this.id = id;
        this.procedureName = procedureName;
    }
}
