package com.example.ProyectoFinal.controller;

import com.example.ProyectoFinal.model.Registros;
import com.example.ProyectoFinal.service.IServiceRegistros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registros")
public class ControllerRegistros {
    @Autowired
    private IServiceRegistros serviceRegistros;

    @GetMapping("/all")
    public List<Registros> getAll() {
        return serviceRegistros.getAll();
    }

    @PostMapping("/create")
    public Registros create(@RequestBody Registros registros) { return
            serviceRegistros.create(registros);
    }
}
