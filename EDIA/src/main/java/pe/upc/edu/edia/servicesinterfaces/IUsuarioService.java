package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();
    public void insert(Usuario u);
    public Usuario listId(Long idUsuario);
    public void update(Usuario u);
    public void delete(Long idUsuario);
}
