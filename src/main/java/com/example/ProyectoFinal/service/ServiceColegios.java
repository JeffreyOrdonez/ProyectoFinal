package com.example.ProyectoFinal.service;



import com.example.ProyectoFinal.model.Colegios;
import com.example.ProyectoFinal.repository.IRepoColegios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceColegios implements IServiceColegios{

    @Autowired
    private IRepoColegios repoAgenda;

    @Override
    public List<Colegios> getAll() {
        return repoAgenda.findAll();
    }

    @Override
    public Colegios create(Colegios colegios) {
        return repoAgenda.save(colegios);
    }
}
