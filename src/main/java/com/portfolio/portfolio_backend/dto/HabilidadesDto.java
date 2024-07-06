package com.portfolio.portfolio_backend.dto;

import jakarta.validation.constraints.NotBlank;

public class HabilidadesDto {

    @NotBlank
    private String nombre;
    @NotBlank
    private String valor;

    public HabilidadesDto() {
    }

    public HabilidadesDto(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
