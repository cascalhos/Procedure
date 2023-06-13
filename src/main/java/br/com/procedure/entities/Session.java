package br.com.procedure.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class Session {
    @Id
    private Integer id;
    private String SessionName;
    private Float price;
}
