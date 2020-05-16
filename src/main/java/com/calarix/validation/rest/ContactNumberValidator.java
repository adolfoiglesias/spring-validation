package com.calarix.validation.rest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements
        ConstraintValidator<ContactNumberConstraint, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && value.matches("[0-9]+")
                && (value.length() > 8) && (value.length() < 14);
    }
    @Override
    public void initialize(ContactNumberConstraint constraintAnnotation) {

    }
}
