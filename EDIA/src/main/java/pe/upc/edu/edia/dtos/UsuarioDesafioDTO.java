package pe.upc.edu.edia.dtos;

import pe.upc.edu.edia.entities.DesafioTemporal;
import pe.upc.edu.edia.entities.Usuario;

public class UsuarioDesafioDTO {
    private int idUsuarioDesafio;
    private float Puntaje;
    private Usuario usuario;
    private DesafioTemporal desafioTemporal;

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
