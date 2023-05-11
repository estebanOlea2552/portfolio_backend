package com.portfolio.portfolio_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Encabezado {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String portada;
  private String perfil;
  private String nombre;
  private String descripcion;
  private String residencia;

    public Encabezado() {}
    
    public Encabezado(Long id, String portada, String perfil, String nombre, String descripcion, String residencia) {
        this.id = id;
        this.portada = portada;
        this.perfil = perfil;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.residencia = residencia;
    }     
}
