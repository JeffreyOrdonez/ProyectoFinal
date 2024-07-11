package com.example.ProyectoFinal.controller;


import com.example.ProyectoFinal.model.Colegios;
import com.example.ProyectoFinal.service.IServiceColegios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colegios")
public class ControllerColegios {

    @Autowired
    private IServiceColegios serviceColegios;

    @GetMapping("/all")
    public List<Colegios> getAll() {
        return serviceColegios.getAll();
    }

    @PostMapping("/create")
    public Colegios create(@RequestBody Colegios agenda) { return
        serviceColegios.create(agenda);
    }
}
