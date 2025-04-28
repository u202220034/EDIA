package pe.upc.edu.edia.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Comentario")
public class Comentario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;

    @Column(name="contenido",length = 50, nullable = false)
    private String contenido;

    @Column(name="fechaComentario",nullable = false)
    private Date fechaComentario;

    @ManyToOne
    @JoinColumn(name="idPublicacion")
    private Publicacion publicacion;

    public Comentario() {}

    public Comentario(int idComentario, String contenido, Date fechaComentario, Publicacion publicacion) {
        this.idComentario = idComentario;
        this.contenido = contenido;
        this.fechaComentario = fechaComentario;
        this.publicacion = publicacion;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
}


