package com.org.lob.std.service.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RollNumberValidator implements ConstraintValidator<ValidName, String> {

	private String regExp = "[a-zA-Z]+";

	@Override
	public boolean isValid(String name, ConstraintValidatorContext context) {

		return name.matches(regExp);
	}
}