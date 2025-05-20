package pe.upc.edu.edia.dtos;

import pe.upc.edu.edia.entities.Curso;

public class LeccionesDTO {
    private int idLecciones;
    private String titulo;
    private Curso curso;

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
