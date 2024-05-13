package com.hampcode.Bankingservice.model.dto;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TransactionRequestDTO {

    @NotNull(message = "El numero de la cuenta de origen no puede estar vacio")
    private String sourceAccountNumber;

    @NotNull(message = "El numero de la cuenta de destino no puede estar vacio")
    private String targetAccountNumber;

    @NotNull(message = "El monto no puede estar vacio")
    @DecimalMin(value = "0.01", message = "La cantidad debe der mayor que cero")
    private BigDecimal amount;

    @NotBlank(message = "La descripcion no puede estar vacio")
    private String description;

}
