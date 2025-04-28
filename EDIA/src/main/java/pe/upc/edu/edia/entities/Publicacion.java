package pe.upc.edu.edia.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;

    @Column (name="Titulo",nullable = false,length=200)
    private String Titulo;

    @Column (name="Contenido",nullable = false,length=200)
    private String Contenido;

    @Column(name="FechaPublicacion", nullable = false)
    private Date FechaPublicacion;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="idForo")
    private Foro foro;

    public Publicacion() {}

    public Publicacion(int idPublicacion, String titulo, String contenido, Date fechaPublicacion, Usuario usuario, Foro foro) {
        this.idPublicacion = idPublicacion;
        Titulo = titulo;
        Contenido = contenido;
        FechaPublicacion = fechaPublicacion;
        this.usuario = usuario;
        this.foro = foro;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Foro getForo() {
        return foro;
    }

    public void setForo(Foro foro) {
        this.foro = foro;
    }
}
