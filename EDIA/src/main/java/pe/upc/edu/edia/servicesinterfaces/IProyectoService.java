package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.Proyecto;

import java.util.List;

public interface IProyectoService {

    public List<Proyecto> list();
    public void insert(Proyecto p);
    public Proyecto listId(int idProyecto);
    public void update(Proyecto p);
    public void delete(int idProyecto);
}
