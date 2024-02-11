package com.grupo.escala.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Grupo {

     @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id_Grupo;
    private String nome;
  //  private Pessoa id;
    //lista de escalas
}
