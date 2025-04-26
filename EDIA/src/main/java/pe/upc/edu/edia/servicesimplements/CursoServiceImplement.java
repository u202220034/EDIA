package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.Curso;
import pe.upc.edu.edia.repositories.ICursoRepository;
import pe.upc.edu.edia.servicesinterfaces.ICursoService;

import java.util.List;

@Service
public class CursoServiceImplement implements ICursoService {

    @Autowired
    private ICursoRepository curR;

    @Override
    public List<Curso> list() {return curR.findAll();}

    @Override
    public void insert(Curso cur) {curR.save(cur);}

    @Override
    public Curso listId(int idCurso) {return curR.findById(idCurso).orElse(new Curso());}

    @Override
    public void update(Curso cats) {curR.save(cats);}
    @Override
    public void delete(int idCurso) {curR.deleteById(idCurso);}
    }


