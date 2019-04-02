package br.unisul.exercicios.progweb.domain.disciplina;

import java.util.List;

public interface DisciplinaService {

    List<Disciplina> listarTodos();

    Disciplina buscarPorId(Long id);
}
