package pe.upc.edu.edia.dtos;

import pe.upc.edu.edia.entities.Curso;
import pe.upc.edu.edia.entities.Usuario;

import java.util.Date;

public class UsuarioCursoDTO {

    private int idUsuarioCurso;
    private Date FechaInicio;
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
