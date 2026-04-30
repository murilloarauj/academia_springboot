package com.facens.academia.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlunoRequest {

    @NotBlank(message = "É necessário informar o nome")
    @Size(min = 2, max = 150, message = "O nome precisa ter entre 2 e 150 caracteres")
    private String nome;

    @NotBlank(message = "É necessário informar o e-mail")
    @Email(message = "O e-mail informado não é válido")
    private String email;

    @NotBlank(message = "É necessário informar o CPF")
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "O CPF deve seguir o padrão 000.000.000-00")
    private String cpf;

    @Size(max = 20, message = "O telefone pode ter no máximo 20 caracteres")
    private String telefone;

    @Past(message = "A data de nascimento deve ser anterior à data atual")
    private LocalDate dataNascimento;

    @NotNull(message = "É necessário informar o ID do plano")
    private Long planoId;
}
