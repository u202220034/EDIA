package pe.upc.edu.edia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="UsuarioCurso")
public class UsuarioCurso{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarioCurso;


    @Column(name="FechaInicio", nullable = false)
    private Date FechaInicio;

    @Column(name="Estatus_Curso", nullable = false)
    private BigDecimal Estatus_Curso;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;

    public UsuarioCurso(int idUsuarioCurso, Date fechaInicio, BigDecimal estatus_Curso, Usuario usuario, Curso curso) {
        this.idUsuarioCurso = idUsuarioCurso;
        FechaInicio = fechaInicio;
        Estatus_Curso = estatus_Curso;
        this.usuario = usuario;
        this.curso = curso;
    }

    public UsuarioCurso() {

    }

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

    public BigDecimal getEstatus_Curso() {
        return Estatus_Curso;
    }

    public void setEstatus_Curso(BigDecimal estatus_Curso) {
        Estatus_Curso = estatus_Curso;
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
