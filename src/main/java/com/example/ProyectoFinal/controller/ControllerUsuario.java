package com.example.ProyectoFinal.controller;


import com.example.ProyectoFinal.model.Usuario;
import com.example.ProyectoFinal.repository.IRepoUsuario;
import com.example.ProyectoFinal.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class ControllerUsuario {

    @Autowired
    private IServiceUsuario serviceUsuario;

    @Autowired
    private IRepoUsuario repoUsuario;

    @GetMapping("/login")
    public Integer getLogin(@RequestParam("email") String email,
                                           @RequestParam("password") String password) {
        return serviceUsuario.getLogin(email,password);
    }

    @PostMapping("/create")
    public void create(@RequestBody Usuario usuario) {
        repoUsuario.save(usuario);
    }
}
