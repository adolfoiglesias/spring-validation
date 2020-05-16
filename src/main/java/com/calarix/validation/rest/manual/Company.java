package com.calarix.validation.rest.manual;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Company {

    public Long id;

    @NotBlank
    @Size(min = 6, max = 15)
    public String name;


}
