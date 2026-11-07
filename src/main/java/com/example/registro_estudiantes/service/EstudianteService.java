package com.example.registro_estudiantes.service;

import java.util.List;
 
import org.springframework.stereotype.Service;
 
import com.example.registro_estudiantes.model.Estudiante;
import com.example.registro_estudiantes.repository.EstudianteRepository;
 
@Service
public class EstudianteService {
 
    private final EstudianteRepository repositorio;
 
    public EstudianteService(EstudianteRepository repositorio) {
        this.repositorio = repositorio;
    }
 
    public List<Estudiante> listar() {
        return repositorio.findAll();
    }
 
    public Estudiante buscarPorId(int id) {
        return repositorio.findById(id).orElse(null); // null si no existe
    }
 
    // Si el id es 0 lo crea; si ya existe lo actualiza
    public void guardar(Estudiante estudiante) {
        repositorio.save(estudiante);
    }
 
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}