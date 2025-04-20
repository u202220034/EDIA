package pe.upc.edu.edia.entities;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name ="DesafioTemporal")
public class DesafioTemporal {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idDesafioTemporal;

    @Column(name = "NombreDesafio", nullable = false, length = 50)
    private String NombreDesafio;

    @Column(name = "Descripcion", nullable = false, length = 120)
    private String Descripcion;

    @Column(name = "FechaInicio", nullable = false)
    private LocalDate FechaInicio;

    @Column(name = "FechaCulminacion", nullable = false)
    private LocalDate FechaCulminacion;

    public DesafioTemporal() {
    }

    public DesafioTemporal(int idDesafioTemporal, String nombreDesafio, String descripcion, LocalDate fechaInicio, LocalDate fechaCulminacion) {
        this.idDesafioTemporal = idDesafioTemporal;
        NombreDesafio = nombreDesafio;
        Descripcion = descripcion;
        FechaInicio = fechaInicio;
        FechaCulminacion = fechaCulminacion;
    }

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
