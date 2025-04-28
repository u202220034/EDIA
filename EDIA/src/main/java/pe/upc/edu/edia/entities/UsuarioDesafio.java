package pe.upc.edu.edia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "UsuarioDesafio")
public class UsuarioDesafio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarioDesafio;

    @Column(name = "Puntaje", nullable = false, length = 10)
    private float Puntaje;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name ="idDesafioTemporal")
    private DesafioTemporal desafioTemporal;

    public UsuarioDesafio() {
    }

    public UsuarioDesafio(int idUsuarioDesafio, float puntaje, Usuario usuario, DesafioTemporal desafioTemporal) {
        this.idUsuarioDesafio = idUsuarioDesafio;
        Puntaje = puntaje;
        this.usuario = usuario;
        this.desafioTemporal = desafioTemporal;
    }

    public int getIdUsuarioDesafio() {
        return idUsuarioDesafio;
    }

    public void setIdUsuarioDesafio(int idUsuarioDesafio) {
        this.idUsuarioDesafio = idUsuarioDesafio;
    }

    public float getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(float puntaje) {
        Puntaje = puntaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public DesafioTemporal getDesafioTemporal() {
        return desafioTemporal;
    }

    public void setDesafioTemporal(DesafioTemporal desafioTemporal) {
        this.desafioTemporal = desafioTemporal;
    }
}
