package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.UsuarioDesafio;
import pe.upc.edu.edia.repositories.IUsuarioDesafioRepository;
import pe.upc.edu.edia.servicesinterfaces.IUsuarioDesafioService;

import java.util.List;

@Service
public class UsuarioDesafioServiceImplement implements IUsuarioDesafioService {
    @Autowired
    private IUsuarioDesafioRepository udR;


    @Override
    public List<UsuarioDesafio> list() {
        return List.of();
    }

    @Override
    public void insert(UsuarioDesafio ud) {

    }

    @Override
    public UsuarioDesafio listId(int idUsuarioDesafio) {
        return null;
    }

    @Override
    public void update(UsuarioDesafio ud) {

    }

    @Override
    public void delete(int idUsuarioDesafio) {

    }
}
