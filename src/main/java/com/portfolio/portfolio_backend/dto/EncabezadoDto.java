package com.portfolio.portfolio_backend.dto;

import jakarta.validation.constraints.NotBlank;

public class EncabezadoDto {

    @NotBlank
    private String portada;
    @NotBlank
    private String perfil;
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String residencia;

    public EncabezadoDto() {
    }

    public EncabezadoDto(String portada, String perfil, String nombre, String descripcion, String residencia) {
        this.portada = portada;
        this.perfil = perfil;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.residencia = residencia;
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
