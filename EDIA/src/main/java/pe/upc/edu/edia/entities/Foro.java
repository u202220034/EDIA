package pe.upc.edu.edia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Foro")
public class Foro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idForo;

    @Column (name="NombreForo",nullable = false,length=90)
    private String NombreForo;

    @Column (name="TipoForo",nullable = false,length=60)
    private String TipoForo;

    @Column (name="FechaCreacion", nullable = false)
    private Date FechaCreacion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="idCurso")
    private Curso curso;

    public Foro() {}

    public Foro(int idForo, String nombreForo, String tipoForo, Date fechaCreacion, Curso curso) {
        this.idForo = idForo;
        NombreForo = nombreForo;
        TipoForo = tipoForo;
        FechaCreacion = fechaCreacion;
        this.curso = curso;
    }

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
