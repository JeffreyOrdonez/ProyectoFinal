package com.example.ProyectoFinal.service;

import org.springframework.stereotype.Service;

@Service
public interface IServiceUsuario {

    int getLogin(String email, String password);
}
