package br.com.adriano.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UnsuportException (String exception) {
		super(exception);
	}

}
