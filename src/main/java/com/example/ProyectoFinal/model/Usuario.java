package com.example.ProyectoFinal.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Usuario extends IdentifiedId{

    private String email;

    private String password;

}
