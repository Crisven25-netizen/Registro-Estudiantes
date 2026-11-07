package com.example.registro_estudiantes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("titulo", "Registro de estudiantes");
        model.addAttribute("curso", "Undécimo año");
        return "estudiantes/index";
    }
}