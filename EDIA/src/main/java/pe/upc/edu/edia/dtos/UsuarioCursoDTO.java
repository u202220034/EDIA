package pe.upc.edu.edia.dtos;

import pe.upc.edu.edia.entities.Curso;
import pe.upc.edu.edia.entities.Usuario;

import java.math.BigDecimal;
import java.util.Date;

public class UsuarioCursoDTO {

    private int idUsuarioCurso;
    private Date FechaInicio;
    private Usuario usuario;
    private Curso curso;
    private BigDecimal Estatus_Curso;

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

    public BigDecimal getEstatus_Curso() {
        return Estatus_Curso;
    }

    public void setEstatus_Curso(BigDecimal estatus_Curso) {
        Estatus_Curso = estatus_Curso;
    }
}
