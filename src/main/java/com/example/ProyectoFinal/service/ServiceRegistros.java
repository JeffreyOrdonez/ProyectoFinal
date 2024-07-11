package com.example.ProyectoFinal.service;



import com.example.ProyectoFinal.model.Registros;
import com.example.ProyectoFinal.repository.IRepoRegistros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceRegistros implements IServiceRegistros {
    @Autowired
    private IRepoRegistros repoRegistros;

    @Override
    public List<Registros> getAll() {
        return repoRegistros.findAll();
    }

    @Override
    public Registros create(Registros registros) {
        return repoRegistros.save(registros);
    }

}
