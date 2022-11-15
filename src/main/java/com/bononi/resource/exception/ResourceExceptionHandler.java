package com.bononi.resource.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bononi.service.excecao.AuthorizationException;
import com.bononi.service.excecao.ObjectNotFoundException;

	@ControllerAdvice
	public class ResourceExceptionHandler {
		@ExceptionHandler(ObjectNotFoundException.class)
		public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
			StandardError err= new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
			
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
		}
		
		@ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<ValidationError> validation(MethodArgumentNotValidException e, HttpServletRequest request){
			String erro = "Favor verificar o campo:";
		    ValidationError err= new ValidationError(HttpStatus.BAD_REQUEST.value(), "Erro de Validação", System.currentTimeMillis());
			for(FieldError x: e.getBindingResult().getFieldErrors()) {
				erro =  erro + x.getDefaultMessage();
				err.setCampo(x.getField());
				err.setMensagem(erro);
			}		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
		}
		
		@ExceptionHandler(AuthorizationException.class)
		public ResponseEntity<StandardError> authorization(AuthorizationException e, HttpServletRequest request){
			StandardError err= new StandardError(HttpStatus.FORBIDDEN.value(), e.getMessage(), System.currentTimeMillis());
			
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(err);
		}
}