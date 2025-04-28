package pe.upc.edu.edia.dtos;

import pe.upc.edu.edia.entities.DesafioTemporal;

public class RetosDesafioDTO {
    private int idRetosDesafio;
    private String PreguntaReto;
    private Boolean Estatus;
    private DesafioTemporal desafioTemporal;

    public int getIdRetosDesafio() {
        return idRetosDesafio;
    }

    public void setIdRetosDesafio(int idRetosDesafio) {
        this.idRetosDesafio = idRetosDesafio;
    }

    public String getPreguntaReto() {
        return PreguntaReto;
    }

    public void setPreguntaReto(String preguntaReto) {
        PreguntaReto = preguntaReto;
    }

    public Boolean getEstatus() {
        return Estatus;
    }

    public void setEstatus(Boolean estatus) {
        Estatus = estatus;
    }

    public DesafioTemporal getDesafioTemporal() {
        return desafioTemporal;
    }

    public void setDesafioTemporal(DesafioTemporal desafioTemporal) {
        this.desafioTemporal = desafioTemporal;
    }
}
