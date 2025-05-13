package pe.upc.edu.edia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "RetosDesafio")
public class RetosDesafio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRetosDesafio;

    @Column(name = "PreguntaReto", nullable = false, length = 100)
    private String PreguntaReto;

    @Column(name = "Estatus", nullable = false)
    private Boolean Estatus;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idDesafioTemporal")
    private DesafioTemporal desafioTemporal;

    public RetosDesafio() {
    }

    public RetosDesafio(int idRetosDesafio, String preguntaReto, Boolean estatus, DesafioTemporal desafioTemporal) {
        this.idRetosDesafio = idRetosDesafio;
        PreguntaReto = preguntaReto;
        Estatus = estatus;
        this.desafioTemporal = desafioTemporal;
    }

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
