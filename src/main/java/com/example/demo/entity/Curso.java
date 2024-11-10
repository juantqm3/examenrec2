package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 20)
    private String nombre;
    

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "curso")
	@JsonIgnore
	private Set<Nota> notas;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Set<Nota> getNotas() {
		return notas;
	}


	public void setNotas(Set<Nota> notas) {
		this.notas = notas;
	}


	public Curso(Long id, String nombre, Set<Nota> notas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.notas = notas;
	}


	public Curso() {
	
	}

}
