package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.Foro;

import java.util.List;

public interface IForoService {
    public List<Foro> list();
    public void insert(Foro f);
    public Foro ListId(int idForo);
    public void update(Foro f);
    public void delete(int idForo);
    public List<String[]> listarForosPorTipo(String tipo);
}
