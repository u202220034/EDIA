package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.UsuarioDesafio;

import java.util.List;

public interface IUsuarioDesafioService {

    public List<UsuarioDesafio> list();
    public void insert(UsuarioDesafio ud);
    public UsuarioDesafio listId(int idUsuarioDesafio);
    public void update(UsuarioDesafio ud);
    public void delete(int idUsuarioDesafio);
    public List<String[]> verUsuarioDesafio();
}
