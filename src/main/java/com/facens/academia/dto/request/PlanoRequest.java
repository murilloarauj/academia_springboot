package com.facens.academia.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanoRequest {

    @NotBlank(message = "É necessário informar o nome do plano")
    @Size(min = 2, max = 100, message = "O nome do plano deve conter entre 2 e 100 caracteres")
    private String nome;

    @Size(max = 255, message = "A descrição pode ter no máximo 255 caracteres")
    private String descricao;

    @NotNull(message = "É necessário informar o valor mensal")
    @DecimalMin(value = "0.01", message = "O valor mensal precisa ser maior que zero")
    private BigDecimal valorMensal;

    @NotNull(message = "É necessário informar a duração em meses")
    @Min(value = 1, message = "A duração deve ser de no mínimo 1 mês")
    @Max(value = 24, message = "A duração deve ser de no máximo 24 meses")
    private Integer duracaoMeses;
}
