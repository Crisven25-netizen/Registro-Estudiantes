package com.example.registro_estudiantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registro_estudiantes.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    
}
