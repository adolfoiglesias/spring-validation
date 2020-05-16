package com.calarix.validation.rest;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target( { ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordConstraint {

    String message() default "Fields values don't match!";
    String field();
    String fieldMatch();

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
