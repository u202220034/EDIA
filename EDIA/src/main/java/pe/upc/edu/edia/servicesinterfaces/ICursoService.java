package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.Curso;

import java.util.List;

public interface ICursoService {
    public List<Curso> list();
    public void insert(Curso cats);
    public Curso listId(int idCurso);
    public void update(Curso cats);
    public void delete(int idCurso);
}
