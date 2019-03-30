package br.unisul.exercicios.progweb.domain.aluno;

import java.util.List;

public interface AlunoSerive {

    Aluno buscarPorId(Long id);

    List<Aluno> listarTodos();
}
