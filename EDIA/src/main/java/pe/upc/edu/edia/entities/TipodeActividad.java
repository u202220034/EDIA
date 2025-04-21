package pe.upc.edu.edia.entities;

import jakarta.persistence.*;

@Entity
@Table(name="TipodeActividad")
public class TipodeActividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipodeActividad;

    @Column(name="nombreTipodeActividad", nullable = false, length = 30)
    private String nombreTipodeActividad;

    public TipodeActividad() {}

    public TipodeActividad(int idTipodeActividad, String nombreTipodeActividad) {
        this.idTipodeActividad = idTipodeActividad;
        this.nombreTipodeActividad = nombreTipodeActividad;
    }

    public int getIdTipodeActividad() { return idTipodeActividad;}

    public void setIdTipodeActividad(int idTipodeActividad) { this.idTipodeActividad = idTipodeActividad;}

    public String getNombreTipodeActividad() { return nombreTipodeActividad;}

    public void setNombreTipodeActividad(String nombreTipodeActividad) { this.nombreTipodeActividad = nombreTipodeActividad;}
}
