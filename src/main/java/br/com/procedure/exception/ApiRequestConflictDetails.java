package br.com.procedure.exception;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
public class ApiRequestConflictDetails {
    private HttpStatus status;
    private String details;
    private LocalDateTime timestamp;

}
