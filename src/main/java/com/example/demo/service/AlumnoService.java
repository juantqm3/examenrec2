package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Alumno;

public interface AlumnoService {
    Alumno create(Alumno a);
    Alumno update(Alumno a);
    Optional<Alumno> read(Long id);
    void delete(Long id);
    List<Alumno> readAll();
}

