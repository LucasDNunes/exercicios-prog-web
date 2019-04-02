package br.unisul.exercicios.progweb.config;

import br.unisul.exercicios.progweb.domain.aluno.Aluno;
import br.unisul.exercicios.progweb.domain.aluno.AlunoRepository;
import br.unisul.exercicios.progweb.domain.disciplina.Disciplina;
import br.unisul.exercicios.progweb.domain.disciplina.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DbService {

    private final AlunoRepository alunoRepository;
    private final DisciplinaRepository disciplinaRepository;

    @Autowired
    public DbService(AlunoRepository alunoRepository, DisciplinaRepository disciplinaRepository) {
        this.alunoRepository = alunoRepository;
        this.disciplinaRepository = disciplinaRepository;
    }

    public void inicializaBancoDeDados() {

        Aluno aluno1 = Aluno.builder()
                .nome("Aluno 1")
                .emails(Arrays.asList("aluno1@email1.com", "aluno1@email2.com"))
                .build();

        Aluno aluno2 = Aluno.builder()
                .nome("Aluno 2")
                .emails(Arrays.asList("aluno2@email1.com", "aluno2@email2.com"))
                .build();

        alunoRepository.saveAll(Arrays.asList(aluno1, aluno2));

        Disciplina disciplina1 = Disciplina.builder()
                .nome("Disciplina 1")
                .semestre(1)
                .build();

        Disciplina disciplina2 = Disciplina.builder()
                .nome("Disciplina 2")
                .semestre(2)
                .build();

        disciplinaRepository.saveAll(Arrays.asList(disciplina1, disciplina2));
    }

}
