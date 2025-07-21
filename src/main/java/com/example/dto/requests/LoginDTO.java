package com.example.dto.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {
    @NotEmpty(message = "Email must be provided.")
    @Email(message = "Invalid email provided")
    private String email;

    @NotEmpty(message = "Password must be provided.")
    private String password;
}
