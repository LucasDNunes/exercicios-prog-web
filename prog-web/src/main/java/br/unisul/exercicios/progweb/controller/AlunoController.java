package br.unisul.exercicios.progweb.controller;

import br.unisul.exercicios.progweb.controller.dto.AlunoDto;
import br.unisul.exercicios.progweb.domain.aluno.AlunoSerive;
import br.unisul.exercicios.progweb.domain.disciplina.DisciplinaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoSerive alunoSerive;
    private final ModelMapper modelMapper;

    @Autowired
    public AlunoController(AlunoSerive alunoSerive, DisciplinaService disciplinaService, ModelMapper modelMapper) {
        this.alunoSerive = alunoSerive;
        this.modelMapper = modelMapper;
    }


    @GetMapping
    public List<AlunoDto> listarTodos() {
        return alunoSerive.listarTodos().stream()
                .map(a -> modelMapper.map(a, AlunoDto.class)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public AlunoDto buscarPorId(@PathVariable Long id) {
        return modelMapper.map(alunoSerive.buscarPorId(id), AlunoDto.class);
    }
}
