package br.com.procedure.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionUpdateRequest {
    private String sessionName;
    private Float price;

}
