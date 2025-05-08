package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.Publicacion;

import java.util.List;


public interface IPublicacionService {
    public List<Publicacion> list();
    public void insert(Publicacion pub);
    public Publicacion listId(int idPublicacion);
    public void update(Publicacion pub);
    public void delete(int idPublicacion);
}
