package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.Categoria;

import java.util.List;

public interface ICategoriaService {
    public List<Categoria> list();

    public void insert(Categoria cats);

    public Categoria listId(int idCategoria);
    public void update(Categoria cats);
    public void delete(int idCategoria);
}
