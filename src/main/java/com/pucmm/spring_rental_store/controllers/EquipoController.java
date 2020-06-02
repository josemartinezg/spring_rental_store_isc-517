package com.pucmm.spring_rental_store.controllers;

import com.pucmm.spring_rental_store.models.Equipo;
import com.pucmm.spring_rental_store.repositories.EquipoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Set;

@Controller
public class EquipoController {
    private final EquipoRepository equipoRepository;

    public EquipoController(EquipoRepository equipoRepository){
        this.equipoRepository = equipoRepository;
    }

    @GetMapping("/listar-equipos")
    public List<Equipo> listarEquipos(){
        List<Equipo> misEquipos;
        misEquipos = equipoRepository.findAll();
        return misEquipos;
    }
    @PostMapping("/crear-equipo")
    public void crearEquipo(){
        Equipo nuevoEquipo = new Equipo();
        equipoRepository.save(nuevoEquipo);
    }
}
