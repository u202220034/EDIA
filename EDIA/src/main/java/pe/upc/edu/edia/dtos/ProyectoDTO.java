package pe.upc.edu.edia.dtos;

import jakarta.persistence.*;
import pe.upc.edu.edia.entities.Usuario;

import java.time.LocalDateTime;

public class ProyectoDTO {
    private int idProyecto;
    private String nombreProyecto;
    private String contenido;
    private LocalDateTime fechaUltActualizacion;
    private LocalDateTime fechaCreacion;
    private Usuario usuario;

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaUltActualizacion() {
        return fechaUltActualizacion;
    }

    public void setFechaUltActualizacion(LocalDateTime fechaUltActualizacion) {
        this.fechaUltActualizacion = fechaUltActualizacion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
