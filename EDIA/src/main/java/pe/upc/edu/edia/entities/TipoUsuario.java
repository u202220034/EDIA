package pe.upc.edu.edia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="TipoUsuario", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "tipoUsuario"})})
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String tipoUsuario;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
