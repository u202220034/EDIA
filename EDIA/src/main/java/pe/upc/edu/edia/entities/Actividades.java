package pe.upc.edu.edia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Actividades")
public class Actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idActividades;

    @Column(name = "Estatus", nullable = false)
    private boolean estatus;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idLecciones")
    private Lecciones lecciones;

    @JsonIgnore
    @ManyToOne
    @JoinColumn( name = "idTipodeActividad")
    private TipodeActividad tipodeActividad;

    public Actividades() {}

    public Actividades(int idActividades, boolean estatus, Lecciones lecciones, TipodeActividad tipodeActividad) {
        this.idActividades = idActividades;
        this.estatus = estatus;
        this.lecciones = lecciones;
        this.tipodeActividad = tipodeActividad;
    }

    public int getIdActividades() {return idActividades;}

    public void setIdActividades(int idActividades) {this.idActividades = idActividades;}

    public boolean isEstatus() {return estatus;}

    public void setEstatus(boolean estatus) {this.estatus = estatus;}

    public Lecciones getLecciones() {return lecciones;}

    public void setLecciones(Lecciones lecciones) {this.lecciones = lecciones;}

    public TipodeActividad getTipodeActividad() {return tipodeActividad;}

    public void setTipodeActividad(TipodeActividad tipodeActividad) {this.tipodeActividad = tipodeActividad;}
}
