package pe.upc.edu.edia.dtos;

public class ListarForoPorTipoDTO {
    private String tipo_foro;
    private int id_foro;
    private String nombre_foro;

    public String getTipo_foro() {
        return tipo_foro;
    }

    public void setTipo_foro(String tipo_foro) {
        this.tipo_foro = tipo_foro;
    }

    public int getId_foro() {
        return id_foro;
    }

    public void setId_foro(int id_foro) {
        this.id_foro = id_foro;
    }

    public String getNombre_foro() {
        return nombre_foro;
    }

    public void setNombre_foro(String nombre_foro) {
        this.nombre_foro = nombre_foro;
    }
}
