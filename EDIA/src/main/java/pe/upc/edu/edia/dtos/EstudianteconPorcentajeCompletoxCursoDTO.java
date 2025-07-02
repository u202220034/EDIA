package pe.upc.edu.edia.dtos;

import java.math.BigDecimal;

public class EstudianteconPorcentajeCompletoxCursoDTO {
    private String nombrecurso;
    private int cantidadestudiantes;
    private BigDecimal promediocompletado;

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public int getCantidadestudiantes() {
        return cantidadestudiantes;
    }

    public void setCantidadestudiantes(int cantidadestudiantes) {
        this.cantidadestudiantes = cantidadestudiantes;
    }

    public BigDecimal getPromediocompletado() {
        return promediocompletado;
    }

    public void setPromediocompletado(BigDecimal promediocompletado) {
        this.promediocompletado = promediocompletado;
    }
}
