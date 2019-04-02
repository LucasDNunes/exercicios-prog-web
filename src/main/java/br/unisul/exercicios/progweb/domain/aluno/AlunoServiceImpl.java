package br.unisul.exercicios.progweb.domain.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoSerive {

    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public Aluno buscarPorId(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }
}
