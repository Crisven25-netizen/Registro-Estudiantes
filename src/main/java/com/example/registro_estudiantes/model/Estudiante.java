package com.example.registro_estudiantes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Esta clase se guarda como una tabla
public class Estudiante {

    @Id // Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // La base de datos pone el número
    private int id;
    private String nombre;
    private String seccion;
    private int nota;

    // Constructor vacío: lo usa Spring en el formulario
    public Estudiante() {
    }

    public Estudiante(String nombre, String seccion, int nota) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.nota = nota;
        
    }

    // Thymeleaf lo lee como ${e.aprobado}
    public boolean isAprobado() {
        return nota >= 70;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
