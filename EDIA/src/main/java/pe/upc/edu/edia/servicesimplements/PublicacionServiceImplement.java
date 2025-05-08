package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.Publicacion;
import pe.upc.edu.edia.repositories.IPublicacionRepository;
import pe.upc.edu.edia.servicesinterfaces.IPublicacionService;

import java.util.List;

@Service
public class PublicacionServiceImplement implements IPublicacionService {
    @Autowired
    private IPublicacionRepository pubR;

    @Override
    public List<Publicacion> list() {
        return pubR.findAll();
    }

    @Override
    public void insert(Publicacion pub) {
        pubR.save(pub);
    }

    @Override
    public Publicacion listId(int idPublicacion) {
        return pubR.findById(idPublicacion).orElse(new Publicacion());
    }

    @Override
    public void update(Publicacion pub) {
        pubR.save(pub);
    }

    @Override
    public void delete(int idPublicacion) {pubR.deleteById(idPublicacion);}

    @Override
    public List<String[]> comentariosConTitulosPublicacion() {
        return pubR.comentariosConTitulosPublicacion();
    }
}