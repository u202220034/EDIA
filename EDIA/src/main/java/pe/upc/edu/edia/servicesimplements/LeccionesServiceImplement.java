package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.Lecciones;
import pe.upc.edu.edia.repositories.ILeccionesRepository;
import pe.upc.edu.edia.servicesinterfaces.ILeccionesService;

import java.util.List;

@Service
public class LeccionesServiceImplement implements ILeccionesService {

   @Autowired
    private ILeccionesRepository lR;

    @Override
    public List<Lecciones> list() {
        return lR.findAll();
    }

    @Override
    public void insert(Lecciones l) {
        lR.save(l);
    }

    @Override
    public Lecciones listId(int idLecciones) {
        return lR.findById(idLecciones).orElse(new Lecciones());
    }

    @Override
    public void update(Lecciones l) {
        lR.save(l);
    }

    @Override
    public void delete(int idLecciones) {
        lR.deleteById(idLecciones);
    }

    @Override
    public List<String[]> cantidadActividadesPorLeccion() {
        return lR.cantidadActividadesPorLeccion();
    }

    @Override
    public List<String[]> leccionesConActividadesActivas() {
        return lR.leccionesConActividadesActivas();
    }
}
