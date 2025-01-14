package me.klad3.sumapispring.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

    @NotBlank(message = "Username is mandatory")
    private String user;

    @NotBlank(message = "Password is mandatory")
    private String password;
}
