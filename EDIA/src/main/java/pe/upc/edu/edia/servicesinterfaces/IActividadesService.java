package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.Actividades;

import java.util.List;

public interface IActividadesService {
    public List<Actividades> list();

    public void insert(Actividades a);

    public Actividades listId(int idActividades);
    public void update(Actividades a);
    public void delete(int idActividades);
}
