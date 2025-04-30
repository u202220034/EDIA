package pe.upc.edu.edia.security;

import java.io.Serializable;

/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//Clase 4
@Data
@AllArgsConstructor
@NoArgsConstructor*/
public class JwtRequest implements Serializable {
    private static final long serialCursoUID = 5926468583005150707L;
    private String usuario;
    private String password;
    public JwtRequest() {
        super();
        // TODO Auto-generated constructor stub
    }
    public JwtRequest(String usuario, String password) {
        super();
        this.usuario = usuario;
        this.password = password;
    }
    public static long serialCursoUID() {
        return serialCursoUID;
    }
    public String getUsuario() {
        return usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
