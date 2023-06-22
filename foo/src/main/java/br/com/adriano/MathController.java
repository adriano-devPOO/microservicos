package br.com.adriano;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	
	@RequestMapping(value = "/sun/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sun(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new Exception();
		}
		
		Double sun = convertDouble(numberOne) + convertDouble(numberTwo);
		return sun;
	}

	private Double convertDouble(String strNumber) {
		if (strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number)) return Double.parseDouble(number);
		
		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		if (strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
