package com.calarix.validation.rest.levelclass;

@FieldsValueMatch.List({
        @FieldsValueMatch(
                field = "password",
                fieldMatch = "verifyPassword",
                message = "Passwords do not match!"
        ),
        @FieldsValueMatch(
                field = "email",
                fieldMatch = "verifyEmail",
                message = "Email addresses do not match!"
        )
})
public class UserRegistration {
    private String email;
    private String verifyEmail;
    private String password;
    private String verifyPassword;
}
