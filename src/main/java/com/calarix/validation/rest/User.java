package com.calarix.validation.rest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Setter
@Getter
@PasswordConstraint(field = "password", fieldMatch = "passwordRepetead")
public class User {
    public Long id;

    @Email(message = "Email incorrecto")
    public String username;

    @NotBlank
    @Size(min = 9, max = 13)
    @ContactNumberConstraint
    public String phone;


    public String password;


    public String passwordRepetead;

    public String getPassword() {
        return password;
    }
    public String getPasswordRepetead() {
        return passwordRepetead;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordRepetead(String passwordRepetead) {
        this.passwordRepetead = passwordRepetead;
    }
}
