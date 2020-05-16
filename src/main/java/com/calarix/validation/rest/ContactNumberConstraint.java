package com.calarix.validation.rest;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ContactNumberValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ContactNumberConstraint {

     String message() default "Phone invalid";

     Class<?>[] groups() default {};
     Class<? extends Payload>[] payload() default {};

}
