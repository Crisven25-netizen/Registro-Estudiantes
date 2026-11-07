package com.example.registro_estudiantes.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.registro_estudiantes.model.Estudiante;
import com.example.registro_estudiantes.service.EstudianteService;

@Controller
public class EstudianteController {

    private final EstudianteService servicio;

    // Spring nos "inyecta" el servicio (composición)
    public EstudianteController(EstudianteService servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/estudiantes")
    public String listar(Model model) {
        model.addAttribute("estudiantes", servicio.listar());
        return "estudiantes/lista";
    }
    @GetMapping("/estudiantes/{id}")
    public String detalle(@PathVariable("id") int id, Model model) {
        model.addAttribute("estudiante", servicio.buscarPorId(id));
        return "estudiantes/detalle";
    }
    @GetMapping("/estudiantes/nuevo")
public String formulario(Model model) {
    model.addAttribute("estudiante", new Estudiante());
    model.addAttribute("secciones", List.of("11-1", "11-2", "11-3"));
    return "estudiantes/formulario";
} 
    @PostMapping("/estudiantes")
public String guardar(@ModelAttribute Estudiante estudiante) {
    servicio.guardar(estudiante);
    return "redirect:/estudiantes";
}
}
