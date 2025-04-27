package pe.upc.edu.edia.dtos;

import pe.upc.edu.edia.entities.Curso;

import java.util.Date;

public class ForoDTO {

    private int idForo;

    private String NombreForo;

    private String TipoForo;

    private Date FechaCreacion;

    private Curso curso;

    public int getIdForo() {return idForo;}

    public void setIdForo(int idForo) {this.idForo = idForo;}

    public String getNombreForo() {return NombreForo;}

    public void setNombreForo(String nombreForo) {NombreForo = nombreForo;}

    public String getTipoForo() {return TipoForo;}

    public void setTipoForo(String tipoForo) {TipoForo = tipoForo;}

    public Date getFechaCreacion() {return FechaCreacion;}

    public void setFechaCreacion(Date fechaCreacion) {FechaCreacion = fechaCreacion;}

    public Curso getCurso() {return curso;}

    public void setCurso(Curso curso) {this.curso = curso;}
}
