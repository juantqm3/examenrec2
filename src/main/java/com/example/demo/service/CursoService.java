package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Curso;

public interface CursoService {
    Curso create(Curso c);
    Curso update(Curso c);
    Optional<Curso> read(Long id);
    void delete(Long id);
    List<Curso> readAll();
}