package pe.upc.edu.edia.dtos;

import pe.upc.edu.edia.entities.Curso;

public class LeccionesDTO {
    private int idLeccion;
    private String titulo;
    private Curso curso;

    public int getIdLeccion() {return idLeccion;}

    public void setIdLeccion(int idLeccion) {this.idLeccion = idLeccion;}

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public Curso getCurso() {return curso;}

    public void setCurso(Curso curso) {this.curso = curso;}
}
