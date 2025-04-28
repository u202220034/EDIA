package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.Comentario;

import java.util.List;

public interface IComentarioService {
    public List<Comentario> list();
    public void insert(Comentario com);
    public Comentario listId(int idComentario);
    public void update(Comentario com);
    public void delete(int idComentario);
}
