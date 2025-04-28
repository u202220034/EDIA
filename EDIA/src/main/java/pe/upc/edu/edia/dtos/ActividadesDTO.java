package pe.upc.edu.edia.dtos;

import pe.upc.edu.edia.entities.Lecciones;
import pe.upc.edu.edia.entities.TipodeActividad;


public class ActividadesDTO {
    private int idActividades;
    private boolean estatus;
    private Lecciones lecciones;
    private TipodeActividad tipodeActividad;

    public int getIdActividades() {return idActividades;}

    public void setIdActividades(int idActividades) {this.idActividades = idActividades;}

    public boolean isEstatus() {return estatus;}

    public void setEstatus(boolean estatus) {this.estatus = estatus;}

    public Lecciones getLecciones() {return lecciones;}

    public void setLecciones(Lecciones lecciones) {this.lecciones = lecciones;}

    public TipodeActividad getTipodeActividad() {return tipodeActividad;}

    public void setTipodeActividad(TipodeActividad tipodeActividad) {this.tipodeActividad = tipodeActividad;}
}
