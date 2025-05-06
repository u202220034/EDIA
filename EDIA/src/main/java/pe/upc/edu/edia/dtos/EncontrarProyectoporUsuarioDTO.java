package pe.upc.edu.edia.dtos;

public class EncontrarProyectoporUsuarioDTO {
    private int idProyecto;
    private String NombreProyecto;
    private String username;

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return NombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        NombreProyecto = nombreProyecto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
