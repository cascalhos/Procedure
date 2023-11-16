package br.com.procedure.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SessionCreateRequest {
    private String sessionName;
    private Float price;

}
