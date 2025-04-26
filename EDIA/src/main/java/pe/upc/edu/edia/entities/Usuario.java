package pe.upc.edu.edia.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "Usuario", length = 30, unique = true, nullable = false)
    private String usuario;

    @Column(name = "Password", length = 200, nullable = false)
    private String password;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Apellidos", nullable = false)
    private String apellidos;

    @Column(name = "Correo",nullable = false, unique = true)
    private String correo;

    @Column(name = "DNI", nullable = false)
    private String dni;

    @Column(name = "Verificacion", nullable = false)
    private Boolean verificacion;

    @ManyToOne
    @JoinColumn(name = "idTipoUsuario")
    private TipoUsuario tipoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String usuario, String password, String nombre, String apellidos, String correo, String dni, Boolean verificacion, TipoUsuario tipoUsuario)
    {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.dni = dni;
        this.verificacion = verificacion;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(Boolean verificacion) {
        this.verificacion = verificacion;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
