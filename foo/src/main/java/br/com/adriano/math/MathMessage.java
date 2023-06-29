package br.com.adriano.math;

import br.com.adriano.exception.UnsuportException;

public class MathMessage {
	
	MathConvertNumber processingNumber = new MathConvertNumber();

	public void mathAccount(String numberOne, String numberTwo) {
		if (!processingNumber.isNumeric(numberOne) || !processingNumber.isNumeric(numberTwo)) {
			throw new UnsuportException("Atenção! Defina um valor numérico.");
		}
	}
	
	public void mathAccountSquareRoot(String numberOne) {
		if (!processingNumber.isNumeric(numberOne)) {
			throw new UnsuportException("Atenção! Defina um valor numérico.");
		}else if (processingNumber.convertDouble(numberOne) < 0) {
			throw new UnsuportException("Atenção! Valor deve ser maior ou igual a zero.");
		}
	}

}
