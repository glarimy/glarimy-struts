package com.glarimy.struts.validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class PhoneValidator extends FieldValidatorSupport {
	@Override
	public void validate(Object o) throws ValidationException {
		String fieldName = getFieldName();
		String value = (String) getFieldValue(fieldName, o);
		if (value.length() == 10)
			addFieldError(fieldName, o);
	}
}
