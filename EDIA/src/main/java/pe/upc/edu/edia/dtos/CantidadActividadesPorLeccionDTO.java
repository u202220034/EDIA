package pe.upc.edu.edia.dtos;

public class CantidadActividadesPorLeccionDTO {

    private String tituloLeccion;
    private long cantidad;

    public CantidadActividadesPorLeccionDTO(String tituloLeccion, long cantidad) {
        this.tituloLeccion = tituloLeccion;
        this.cantidad = cantidad;
    }

    public String getTituloLeccion() {
        return tituloLeccion;
    }

    public void setTituloLeccion(String tituloLeccion) {
        this.tituloLeccion = tituloLeccion;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }
}
