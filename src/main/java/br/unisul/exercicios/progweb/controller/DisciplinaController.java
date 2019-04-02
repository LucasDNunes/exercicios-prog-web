package br.unisul.exercicios.progweb.controller;

import br.unisul.exercicios.progweb.controller.dto.DisciplinaDto;
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
@RequestMapping("/disciplinas")
public class DisciplinaController {

    private final ModelMapper modelMapper;
    private final DisciplinaService disciplinaService;

    @Autowired
    public DisciplinaController(ModelMapper modelMapper, DisciplinaService disciplinaService) {
        this.modelMapper = modelMapper;
        this.disciplinaService = disciplinaService;
    }

    @GetMapping
    public List<DisciplinaDto> listarTodos() {
        return disciplinaService.listarTodos().stream()
                .map(d -> modelMapper.map(d, DisciplinaDto.class)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public DisciplinaDto buscarPorId(@PathVariable Long id) {
        return modelMapper.map(disciplinaService.buscarPorId(id), DisciplinaDto.class);
    }
}
