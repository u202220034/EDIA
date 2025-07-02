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

    @Column(name="EstadoCurso", nullable = false)
    private int EstadoCurso;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;

    public UsuarioCurso(int idUsuarioCurso, Date fechaInicio, int estadoCurso, Usuario usuario, Curso curso) {
        this.idUsuarioCurso = idUsuarioCurso;
        FechaInicio = fechaInicio;
        EstadoCurso = estadoCurso;
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
