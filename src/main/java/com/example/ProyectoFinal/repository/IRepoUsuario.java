package com.example.ProyectoFinal.repository;


import com.example.ProyectoFinal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoUsuario extends JpaRepository<Usuario,String> {

    @Query("select count(e) from Usuario e " +
            "where e.email = ?1 " +
            "and e.password = ?2")
    int getLogin(String email,String password);

}
