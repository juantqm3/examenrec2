package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Curso;
import com.example.demo.repository.CursoRepository;
import com.example.demo.service.CursoService;
import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public Curso create(Curso c) {
        return null;
    }

    @Override
    public Curso update(Curso c) {
        return null;
    }

    @Override
    public Optional<Curso> read(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Curso> readAll() {
        return cursoRepository.findAll();
    }
}