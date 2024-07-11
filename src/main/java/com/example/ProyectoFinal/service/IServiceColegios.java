package com.example.ProyectoFinal.service;


import com.example.ProyectoFinal.model.Colegios;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceColegios {

    public List<Colegios> getAll();

    public Colegios create(Colegios agenda);

}
