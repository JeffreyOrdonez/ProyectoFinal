package com.example.ProyectoFinal.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Colegios extends IdentifiedId {

    private String nombreColegio;

    private String director;

    private String numeroDirector;

    private String email;

    private String departamento;

    private String municipio;

    private TIPO_HORARIO tipoHorario;

    private TIPO_COLEGIO tipoColegio;

    @OneToMany(mappedBy = "colegios", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Registros> registros;


}
