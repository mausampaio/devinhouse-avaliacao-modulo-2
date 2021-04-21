package br.com.devinhouse.projeto04.exceptions;

import java.util.Date;
import java.util.NoSuchElementException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.devinhouse.projeto04.dto.ErroDTO;

@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Object> handleNoSuchElementException(Exception ex, WebRequest request) {
		
		ErroDTO erroDTO = new ErroDTO(new Date(), "Nenhum processo encontrado", 404);
		
		return ResponseEntity.status(404).body(erroDTO);
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Object> handleConstraintViolationException(Exception ex, WebRequest request) {
		
		ErroDTO erroDTO = new ErroDTO(new Date(), "Processo já cadastrado", 400);
		
		return ResponseEntity.status(400).body(erroDTO);
	}
	
	@Override
	protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
	        HttpStatus status, WebRequest request) {
		
		ErroDTO erroDTO = new ErroDTO(new Date(), "Endpoint não cadastrado", 404);
		
		return ResponseEntity.status(404).body(erroDTO);
	}
}
