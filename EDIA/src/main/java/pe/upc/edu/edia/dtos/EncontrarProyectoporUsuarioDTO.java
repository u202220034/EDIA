package pe.upc.edu.edia.dtos;

public class EncontrarProyectoporUsuarioDTO {
    private String NombreProyecto;
    private String username;

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
