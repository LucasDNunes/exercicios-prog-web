package br.unisul.exercicios.progweb.controller.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlunoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private List<String> emails;
}
