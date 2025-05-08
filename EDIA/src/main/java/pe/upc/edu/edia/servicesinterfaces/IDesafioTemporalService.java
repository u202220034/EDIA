package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.DesafioTemporal;

import java.util.List;

public interface IDesafioTemporalService {
    public List<DesafioTemporal> list();

    public void insert(DesafioTemporal dtems);

    public void delete(int dtems);
    public DesafioTemporal listId(int idDesafioTemporal);
    public void update(DesafioTemporal dtems);
    public List<String[]> verDesafioExpirado();


}
