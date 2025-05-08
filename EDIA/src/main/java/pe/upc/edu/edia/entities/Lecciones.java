package pe.upc.edu.edia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name= "Lecciones")
public class Lecciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLecciones;

    @Column(name = "Titulo", length = 50, nullable = false)
    private String titulo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;

    public Lecciones() {}

    public Lecciones(int idLecciones, String titulo, Curso curso) {
        this.idLecciones = idLecciones;
        this.titulo = titulo;
        this.curso = curso;
    }

    public int getIdLecciones() {
        return idLecciones;
    }

    public void setIdLecciones(int idLecciones) {
        this.idLecciones = idLecciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }


}
