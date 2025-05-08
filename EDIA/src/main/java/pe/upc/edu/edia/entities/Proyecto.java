package pe.upc.edu.edia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProyecto;

    @Column(name = "NombreProyecto", nullable = false)
    private String nombreProyecto;

    @Column(name = "Contenido", nullable = false)
    private String contenido;

    @Column(name = "FechaUltActualizacion", nullable = false)
    private LocalDateTime fechaUltActualizacion;

    @Column(name = "FechaCreacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Proyecto() {}

    public Proyecto(int idProyecto, String nombreProyecto, LocalDateTime fechaUltActualizacion, LocalDateTime fechaCreacion, Usuario usuario) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.contenido = contenido;
        this.fechaUltActualizacion = fechaUltActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
    }

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
