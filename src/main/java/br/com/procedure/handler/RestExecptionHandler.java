package br.com.procedure.handler;

import br.com.procedure.exception.ApiRequestConflictDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.lang.IllegalArgumentException;

@ControllerAdvice
public class RestExecptionHandler {
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ApiRequestConflictDetails> handlerNoSuchElementException(NoSuchElementException exception){
        return new ResponseEntity<>(ApiRequestConflictDetails.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.NOT_FOUND).
                details("Procedure Not Found").build(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiRequestConflictDetails> handlerIllegalArgumentException(IllegalArgumentException exception){
        return new ResponseEntity<>(ApiRequestConflictDetails.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.NOT_FOUND)
                .details("Procedure Not Found").build(),HttpStatus.NOT_FOUND);
    }



}
