package com.grupo.escala.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Escala {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id_Escala;
  //  private Grupo id_Grupo;
    //private Pessoa id;
    private LocalDateTime dataEscala;
    private Boolean cumpriu;
     
}
