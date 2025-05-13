package pe.upc.edu.edia.dtos;

public class LeccionesActivasDTO {

    private String tituloLeccion;

    public LeccionesActivasDTO(String tituloLeccion) {
        this.tituloLeccion = tituloLeccion;
    }

    public String getTituloLeccion() {
        return tituloLeccion;
    }

    public void setTituloLeccion(String tituloLeccion) {
        this.tituloLeccion = tituloLeccion;
    }
}
