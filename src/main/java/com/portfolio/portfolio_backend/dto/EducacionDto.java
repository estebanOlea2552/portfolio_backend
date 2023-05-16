package com.portfolio.portfolio_backend.dto;

import jakarta.validation.constraints.NotBlank;

public class EducacionDto {

  @NotBlank
  private String escuela;
  @NotBlank
  private String carrera;

    public EducacionDto() {}
    public EducacionDto(String escuela, String carrera) {
        this.escuela = escuela;
        this.carrera = carrera;
    }

    public String getEscuela() {
        return escuela;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }   
}
