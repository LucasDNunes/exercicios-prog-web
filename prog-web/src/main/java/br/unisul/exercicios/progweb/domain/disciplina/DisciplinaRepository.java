package br.unisul.exercicios.progweb.domain.disciplina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository  extends JpaRepository<Disciplina, Long> {
}
