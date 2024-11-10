package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Nota;
import com.example.demo.repository.NotaRepository;
import com.example.demo.service.NotaService;

import java.util.List;
import java.util.Optional;

@Service
public class NotaServiceImpl implements NotaService {

    @Autowired
    private NotaRepository notaRepository;

    @Override
    public Nota create(Nota n) {
        return notaRepository.save(n);
    }

    @Override
    public Nota update(Nota n) {
        return notaRepository.save(n);
    }

    @Override
    public Optional<Nota> read(Long id) {
        return notaRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
    	notaRepository.deleteById(id);
    }

    @Override
    public List<Nota> readAll() {
        return notaRepository.findAll();
    }
}
