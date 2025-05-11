package pe.upc.edu.edia.dtos;

public class ActividadesDentroDeLeccionDTO {
    private String tituloLeccion;
    private String tipoActividad;
    private boolean estatus;

    public ActividadesDentroDeLeccionDTO(String tituloLeccion, String tipoActividad, boolean estatus) {
        this.tituloLeccion = tituloLeccion;
        this.tipoActividad = tipoActividad;
        this.estatus = estatus;
    }

    public String getTituloLeccion() {
        return tituloLeccion;
    }

    public void setTituloLeccion(String tituloLeccion) {
        this.tituloLeccion = tituloLeccion;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
}
