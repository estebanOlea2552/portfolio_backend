package com.portfolio.portfolio_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
  
   @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String escuela;
  private String carrera;

    public Educacion() {}
    
    public Educacion(Long id, String escuela, String carrera) {
        this.id = id;
        this.escuela = escuela;
        this.carrera = carrera;
    }
  
  
}
