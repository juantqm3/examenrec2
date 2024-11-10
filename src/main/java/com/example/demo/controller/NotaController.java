package com.example.demo.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Nota;
import com.example.demo.service.NotaService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/notas")
@CrossOrigin(origins = "http://localhost:4200")
public class NotaController {
    @Autowired
    private NotaService notaService;

    @GetMapping
    public ResponseEntity<List<Nota>> readAll(){
        try {
            List<Nota> notes = notaService.readAll();
            if(notes.isEmpty()) {
                return new ResponseEntity<List<Nota>>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(notes, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PostMapping
    public ResponseEntity<Nota> crear(@Valid @RequestBody Nota nota) {
        try {
            Nota notes = notaService.create(nota);
            return new ResponseEntity<>(notes, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity<Nota> getNotaId(@PathVariable("id") Long id){
        try {
            Nota notes = notaService.read(id).get();
            return new ResponseEntity<>(notes, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Nota> delNota(@PathVariable("id") Long id){
        try {
        	notaService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateNota(@PathVariable("id") Long id, @Valid @RequestBody Nota nota){

        Optional<Nota> notes = notaService.read(id);
        if(notes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
        	nota.setId(id);
            return new ResponseEntity<>(notaService.update(nota), HttpStatus.OK);
        }

    }
       
}