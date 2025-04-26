package pe.upc.edu.edia.dtos;

import jakarta.persistence.*;
import pe.upc.edu.edia.entities.Categoria;

import java.math.BigDecimal;

public class CursoDTO {

    private int idCurso;

    private String NombreCurso;

    private String Descripcion;

    private BigDecimal Estatus_Curso;

    private Categoria categoria;

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

    public void setEstatus_Curso(BigDecimal estatus_Curso) {
        Estatus_Curso = estatus_Curso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
