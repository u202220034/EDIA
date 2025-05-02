package pe.upc.edu.edia.dtos;

import java.math.BigDecimal;

public class EstudianteconPorcentajeCompletoxCursoDTO {
    private String username;
    private String Curso;
    private BigDecimal porcentajeCompletado;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public BigDecimal getPorcentajeCompletado() {
        return porcentajeCompletado;
    }

    public void setPorcentajeCompletado(BigDecimal porcentajeCompletado) {
        this.porcentajeCompletado = porcentajeCompletado;
    }
}
