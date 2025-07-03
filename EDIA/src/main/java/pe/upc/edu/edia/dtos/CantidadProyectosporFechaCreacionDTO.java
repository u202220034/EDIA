package pe.upc.edu.edia.dtos;

public class CantidadProyectosporFechaCreacionDTO {
    private String Mes;
    private int totalProyectos;

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public int getTotalProyectos() {
        return totalProyectos;
    }

    public void setTotalProyectos(int totalProyectos) {
        this.totalProyectos = totalProyectos;
    }
}
