package com.portfolio.portfolio_backend.dto;

import jakarta.validation.constraints.NotBlank;

public class AcercaDeDto {

    @NotBlank
    private String descripcion;

    public AcercaDeDto() {
    }

    public AcercaDeDto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
