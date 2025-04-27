package pe.upc.edu.edia.entities;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name="UsuarioCurso")
public class UsuarioCurso{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarioCurso;


    @Column(name="FechaInicio", nullable = false)
    private Date FechaInicio;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;

    public UsuarioCurso(int idUsuarioCurso, Date fechaInicio, Usuario usuario, Curso curso) {
        this.idUsuarioCurso = idUsuarioCurso;
        FechaInicio = fechaInicio;
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
