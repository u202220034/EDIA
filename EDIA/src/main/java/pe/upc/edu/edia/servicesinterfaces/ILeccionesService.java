package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.Lecciones;

import java.util.List;

public interface ILeccionesService {

    public List<Lecciones> list();

    public void insert(Lecciones l);

    public Lecciones listId(int idLecciones);
    public void update(Lecciones l);
    public void delete(int idLecciones);

    List<String[]> cantidadActividadesPorLeccion();

    List<String[]> leccionesConActividadesActivas();

}

