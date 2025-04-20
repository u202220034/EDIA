package pe.upc.edu.edia.dtos;

import java.time.LocalDate;

public class DesafioTemporalDTO {
    private int idDesafioTemporal;
    private String NombreDesafio;
    private String Descripcion;
    private LocalDate FechaInicio;
    private LocalDate FechaCulminacion;

    public int getIdDesafioTemporal() {
        return idDesafioTemporal;
    }

    public void setIdDesafioTemporal(int idDesafioTemporal) {
        this.idDesafioTemporal = idDesafioTemporal;
    }

    public String getNombreDesafio() {
        return NombreDesafio;
    }

    public void setNombreDesafio(String nombreDesafio) {
        NombreDesafio = nombreDesafio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDate getFechaCulminacion() {
        return FechaCulminacion;
    }

    public void setFechaCulminacion(LocalDate fechaCulminacion) {
        FechaCulminacion = fechaCulminacion;
    }
}
