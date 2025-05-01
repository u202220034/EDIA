package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.UsuarioCurso;

import java.util.List;


public interface IUsuarioCursoService {
    public List<UsuarioCurso> list();
    public void insert(UsuarioCurso ucs);
    public UsuarioCurso listId(int idUsuarioCurso);
    public void update(UsuarioCurso ucs);
    public void delete(int idUsuarioCurso);
    public List<String[]> cantidadusuarioxcurso();

}
