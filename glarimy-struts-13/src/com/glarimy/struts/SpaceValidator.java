package com.glarimy.struts;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class SpaceValidator extends FieldValidatorSupport {
	@Override
	public void validate(Object o) throws ValidationException {
		String fieldName = getFieldName();
		String value = (String) getFieldValue(fieldName, o);
		if (value.contains(" "))
			addFieldError(fieldName, o);
	}
}
