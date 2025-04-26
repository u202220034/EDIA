package pe.upc.edu.edia.entities;

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

    @Column(name="Estatus_Curso", nullable = false)
    private BigDecimal Estatus_Curso;

    @ManyToOne
    @JoinColumn(name ="CategoriaCurso_idCategoria")
    private Categoria categoria;

    public Curso() {}

    public Curso(int idCurso, String nombreCurso, String descripcion, int estatus_Curso, Categoria categoria) {
        this.idCurso = idCurso;
        NombreCurso = nombreCurso;
        Descripcion = descripcion;
        Estatus_Curso = BigDecimal.valueOf(estatus_Curso);
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

    public BigDecimal getEstatus_Curso() {
        return Estatus_Curso;
    }

    public void setEstatus_Curso(int estatus_Curso) {
        Estatus_Curso = BigDecimal.valueOf(estatus_Curso);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
