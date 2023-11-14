package br.com.procedure.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Session {

    private String id = UUID.randomUUID().toString();
    private String sessionName;
    private Float price;

    public Session(String sessionName, Float price) {
        this.sessionName = sessionName;
        this.price = price;
    }
}
