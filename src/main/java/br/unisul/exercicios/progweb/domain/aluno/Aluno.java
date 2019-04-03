package br.unisul.exercicios.progweb.domain.aluno;

import br.unisul.exercicios.progweb.core.entity.BaseEntity;
import br.unisul.exercicios.progweb.domain.disciplina.Disciplina;
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

    @Builder.Default
    @ManyToMany
    @JoinTable(name = "aluno_disciplina",
            joinColumns = @JoinColumn(name = "aluno_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    private List<Disciplina> disciplinas = new ArrayList<>();
}
