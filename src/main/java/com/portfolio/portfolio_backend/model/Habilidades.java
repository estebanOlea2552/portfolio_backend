package com.portfolio.portfolio_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nombre;
  private String valor;

    public Habilidades() {}

    public Habilidades(Long id, String nombre, String valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }
  
  
}
