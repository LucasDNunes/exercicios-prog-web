package br.unisul.exercicios.progweb.domain.aluno;

import br.unisul.exercicios.progweb.core.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aluno implements BaseEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Builder.Default
    @ElementCollection
    @CollectionTable(name = "EMAIL")
    private List<String> emails = new ArrayList<>();
}
