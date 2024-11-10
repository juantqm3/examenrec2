package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Alumno;
import com.example.demo.repository.AlumnoRepository;
import com.example.demo.service.AlumnoService;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;
    @Override
    public Alumno create(Alumno a) {
        return null;
    }

    @Override
    public Alumno update(Alumno a) {
        return null;
    }

    @Override
    public Optional<Alumno> read(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Alumno> readAll() {
        return alumnoRepository.findAll();
    }
}