package com.poc.smtp.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmailSenderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public Object clienteOperador;
	
	public String emailOfficer;
	
	public String subject;
	
	public String text;
}
