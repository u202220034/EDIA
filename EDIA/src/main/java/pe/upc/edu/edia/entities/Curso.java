package pe.upc.edu.edia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;

    @Column(name="NombreCurso", nullable = false, length = 50)
    private String NombreCurso;

    @Column(name="Descripcion", nullable = false, length = 200)
    private String Descripcion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name ="CategoriaCurso_idCategoria")
    private Categoria categoria;

    public Curso() {}

    public Curso(int idCurso, String nombreCurso, String descripcion, Categoria categoria) {
        this.idCurso = idCurso;
        NombreCurso = nombreCurso;
        Descripcion = descripcion;
        this.categoria = categoria;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        NombreCurso = nombreCurso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
