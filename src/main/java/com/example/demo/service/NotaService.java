package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Nota;

public interface NotaService {
    Nota create(Nota n);
    Nota update(Nota n);
    Optional<Nota> read(Long id);
    void delete(Long id);
    List<Nota> readAll();
}
