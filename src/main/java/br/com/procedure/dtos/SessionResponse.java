package br.com.procedure.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SessionResponse {
    private String id ;
    private String sessionName;
    private Float price;
}
