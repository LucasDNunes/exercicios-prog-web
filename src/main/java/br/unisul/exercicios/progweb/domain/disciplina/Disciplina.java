package br.unisul.exercicios.progweb.domain.disciplina;

import br.unisul.exercicios.progweb.core.entity.BaseEntity;
import br.unisul.exercicios.progweb.domain.aluno.Aluno;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Disciplina implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer semestre;

    @Builder.Default
    @JsonIgnore
    @ManyToMany(mappedBy = "disciplinas")
    private List<Aluno> alunos = new ArrayList<>();
}
