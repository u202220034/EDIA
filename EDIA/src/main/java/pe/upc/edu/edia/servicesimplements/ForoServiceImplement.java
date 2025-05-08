package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.Foro;
import pe.upc.edu.edia.repositories.IForoRepository;
import pe.upc.edu.edia.servicesinterfaces.IForoService;

import java.util.List;

@Service
public class ForoServiceImplement implements IForoService {

    @Autowired
    private IForoRepository forR;

    @Override
    public List<Foro> list() {
        return forR.findAll();
    }

    @Override
    public void insert(Foro f) {
        forR.save(f);
    }

    @Override
    public Foro ListId(int idForo) {
        return forR.findById(idForo).orElse(new Foro());
    }

    @Override
    public void update(Foro f) {
        forR.save(f);
    }

    @Override
    public void delete(int idForo) {
        forR.deleteById(idForo);
    }
}
