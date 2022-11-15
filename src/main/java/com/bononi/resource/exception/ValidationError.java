package com.bononi.resource.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidationError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();
	private String campo;
	private String mensagem;
	
	
	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(); // super(status, msg, timeStamp);
		
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}
}