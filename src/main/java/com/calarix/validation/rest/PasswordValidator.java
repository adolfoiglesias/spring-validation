package com.calarix.validation.rest;

import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements  ConstraintValidator<PasswordConstraint, Object>  {

    private String field;
    private String fieldMatch;

    @Override
    public void initialize(PasswordConstraint constraintAnnotation) {
        this.field = constraintAnnotation.field();
        this.fieldMatch = constraintAnnotation.fieldMatch();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        Object fieldValue = new BeanWrapperImpl(o)
                .getPropertyValue(field);
        Object fieldMatchValue = new BeanWrapperImpl(o)
                .getPropertyValue(fieldMatch);

        if (fieldValue != null ) {
            return fieldValue.equals(fieldMatchValue);
        } else {
            return false;
        }
    }
}
