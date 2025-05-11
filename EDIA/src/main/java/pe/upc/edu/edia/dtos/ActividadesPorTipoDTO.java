package pe.upc.edu.edia.dtos;

public class ActividadesPorTipoDTO {

    private String nombreTipodeActividad;
    private long cantidad;

    public ActividadesPorTipoDTO(String nombreTipodeActividad, long cantidad) {
        this.nombreTipodeActividad = nombreTipodeActividad;
        this.cantidad = cantidad;
    }

    public String getNombreTipodeActividad() {
        return nombreTipodeActividad;
    }

    public void setNombreTipodeActividad(String nombreTipodeActividad) {
        this.nombreTipodeActividad = nombreTipodeActividad;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }
}

