package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.UsuarioCurso;
import pe.upc.edu.edia.repositories.IUsuarioCursoRepository;
import pe.upc.edu.edia.servicesinterfaces.IUsuarioCursoService;

import java.util.List;

@Service
public class UsuarioCursoImplement implements IUsuarioCursoService {
    @Autowired
    private IUsuarioCursoRepository ucR;

    @Override
    public List<UsuarioCurso> list(){return ucR.findAll();}

    @Override
    public void insert(UsuarioCurso ucs) {ucR.save(ucs);}

    @Override
    public UsuarioCurso listId(int idUsuarioCurso) {return ucR.findById(idUsuarioCurso).orElse(new UsuarioCurso());}

    @Override
    public void update(UsuarioCurso ucs) {ucR.save(ucs);}

    @Override
    public void delete(int idUsuarioCurso) {ucR.deleteById(idUsuarioCurso);}

    @Override
    public List<String[]> cantidadusuarioxcurso() {
        return ucR.cantidadEstudiantesporCurso();
    }

    @Override
    public List<String[]> porcentajeCompletado() {
        return ucR.porcentajeCompletado();
    }

}
