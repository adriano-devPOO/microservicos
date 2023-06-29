package br.com.adriano.math;

public class MathAccount {
	
	public MathConvertNumber processingNumber = new MathConvertNumber();
	
	public Double sum(String numberOne, String numberTwo) {
			
		return processingNumber.convertDouble(numberOne) + processingNumber.convertDouble(numberTwo);
	}
	
	public Double subtraction(String numberOne, String numberTwo) {
				
		return processingNumber.convertDouble(numberOne) - processingNumber.convertDouble(numberTwo);
	}
	
	public Double multiplication(String numberOne, String numberTwo) {
				
		return processingNumber.convertDouble(numberOne) * processingNumber.convertDouble(numberTwo);
	}
	
	public Double division(String numberOne, String numberTwo) {
				
		return processingNumber.convertDouble(numberOne) / processingNumber.convertDouble(numberTwo);
	}
	
	public Double squareRoot(String numberOne) {
				
		return Math.sqrt(processingNumber.convertDouble(numberOne));
	}
	
	public Double mean(String numberOne, String numberTwo) {
				
		return (processingNumber.convertDouble(numberOne) + processingNumber.convertDouble(numberTwo)) / 2;
	}

}
