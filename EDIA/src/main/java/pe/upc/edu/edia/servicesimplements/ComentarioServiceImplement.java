package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.Comentario;
import pe.upc.edu.edia.repositories.IComentarioRepository;
import pe.upc.edu.edia.servicesinterfaces.IComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService {

    @Autowired
    private IComentarioRepository comR;

    @Override
    public List<Comentario> list() {
        return comR.findAll();
    }

    @Override
    public void insert(Comentario com) {
        comR.save(com);
    }

    @Override
    public Comentario listId(int idComentario) {
        return comR.findById(idComentario).orElse(new Comentario());
    }

    @Override
    public void update(Comentario com) {
        comR.save(com);
    }

    @Override
    public void delete(int idComentario) {
        comR.deleteById(idComentario);
    }
}
