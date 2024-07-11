package com.example.ProyectoFinal.repository;



import com.example.ProyectoFinal.model.Registros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRepoRegistros extends JpaRepository<Registros, UUID> {


}