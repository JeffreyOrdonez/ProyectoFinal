package com.example.ProyectoFinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Data

public class Registros extends IdentifiedId{

    private LocalDate fecha;
    private LocalTime hora;
    private TIPO_ESTADO estadoCita;
    private int estudiantesInteresados;
    private int estudiantesGraduados;
    private int porcentajeExito;

    @ManyToOne
    @JoinColumn(name = "colegio_id")
    private Colegios colegios;
}
