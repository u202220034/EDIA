package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.TipodeActividad;

import java.util.List;

public interface ITipodeActividadService {
    public List<TipodeActividad> list();

    public void insert(TipodeActividad tpas);

    public TipodeActividad listId(int idTipodeActividad);
    public void update(TipodeActividad tpas);
    public void delete(int idTipodeActividad);
}
