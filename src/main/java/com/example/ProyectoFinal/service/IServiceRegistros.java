package com.example.ProyectoFinal.service;


import com.example.ProyectoFinal.model.Registros;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IServiceRegistros {

    public List<Registros> getAll();

    public Registros create(Registros agenda);
}
