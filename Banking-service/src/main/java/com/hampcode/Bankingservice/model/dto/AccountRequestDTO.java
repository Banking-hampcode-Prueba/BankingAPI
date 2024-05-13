package com.hampcode.Bankingservice.model.dto;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AccountRequestDTO {

    @NotBlank(message = "El numero de cuenta no puede estar vacio")
    @Size(min = 5, max = 20, message = "El numero de cuenta debe tener estre 5 y 20 caracteres")
    @Pattern(regexp = "[0-9]+", message = "El numero de cuenta debe contener solo digitos")
    private String accountNumber;

    @NotNull(message = "El saldo no puede ser vacio")
    private BigDecimal balance;

    @NotBlank(message = "El nombre del dueño no puede estar vacio")
    private String ownerName;

    @NotBlank(message = "El correo electronino no puede ser vacio")
    @Email
    private String ownerEmail;

}
