package com.calarix.validation.rest.manual;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("companies")
public class CompanyController {

    @PostMapping
    public ResponseEntity<List> save(@RequestBody  Company company){

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        Set<ConstraintViolation<Company>> constraints = validator.validate(company);

        List<String> errors = new ArrayList<>();
        constraints.forEach(constraint -> {
            errors.add(constraint.getMessage());
        });

        return ResponseEntity.ok(errors);

    }
}
