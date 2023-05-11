package com.portfolio.portfolio_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AcercaDe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descripcion;

    public AcercaDe() {}
    
    public AcercaDe(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    
}
