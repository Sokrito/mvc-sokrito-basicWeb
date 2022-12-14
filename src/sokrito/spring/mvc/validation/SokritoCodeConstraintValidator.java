package sokrito.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SokritoCodeConstraintValidator implements ConstraintValidator<SokritoCode, String> {

	
	private String sokritoPrefix;
	@Override
	public void initialize(SokritoCode theSokritoCode) {
		sokritoPrefix = theSokritoCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result;
		if(theCode != null) {
		result = theCode.startsWith(sokritoPrefix);
		}
		else {
		return true;
		}
		return result;
	}
}
