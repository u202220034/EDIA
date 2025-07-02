package pe.upc.edu.edia.dtos;

import jakarta.persistence.*;
import pe.upc.edu.edia.entities.Curso;
import pe.upc.edu.edia.entities.Usuario;

import java.math.BigDecimal;
import java.util.Date;

public class UsuarioCursoDTO {

    private int idUsuarioCurso;


    private Date FechaInicio;

    private int EstadoCurso;

    private Usuario usuario;

    private Curso curso;

    public int getIdUsuarioCurso() {
        return idUsuarioCurso;
    }

    public void setIdUsuarioCurso(int idUsuarioCurso) {
        this.idUsuarioCurso = idUsuarioCurso;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public int getEstadoCurso() {
        return EstadoCurso;
    }

    public void setEstadoCurso(int estadoCurso) {
        EstadoCurso = estadoCurso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
