package com.example.ProyectoFinal.service;


import com.example.ProyectoFinal.repository.IRepoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario implements IServiceUsuario {

    @Autowired
    private IRepoUsuario repoUsuario;
    @Override
    public int getLogin(String email, String password) {
        return repoUsuario.getLogin(email,password);
    }
}
