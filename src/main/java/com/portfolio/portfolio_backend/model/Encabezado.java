package com.portfolio.portfolio_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Encabezado {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
      @NotNull
      private String portada;
      @NotNull
      private String perfil;
      @NotNull
      private String nombre;
      @NotNull
      private String descripcion;
      @NotNull
      private String residencia;

        public Encabezado() {}
    
        public Encabezado(String portada, String perfil, String nombre, String descripcion, String residencia) {

            this.portada = portada;
            this.perfil = perfil;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.residencia = residencia;
        }
    
    public int getId(){
        return id;
    }    
    public void setId(int id) {
        this.id = id;
    }
    public String getPortada() {
        return portada;
    }
    public void setPortada(String portada) {
        this.portada = portada;
    }
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getResidencia() {
        return residencia;
    }
    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }    
}
