package br.unisul.exercicios.progweb.controller.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DisciplinaDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private Integer semestre;
}
