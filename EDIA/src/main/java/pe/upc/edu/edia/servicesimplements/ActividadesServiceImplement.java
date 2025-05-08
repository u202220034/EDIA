package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.Actividades;
import pe.upc.edu.edia.repositories.IActividadesRepository;
import pe.upc.edu.edia.servicesinterfaces.IActividadesService;

import java.util.List;

@Service
public class ActividadesServiceImplement implements IActividadesService {

    @Autowired
    private IActividadesRepository aR;

    @Override
    public List<Actividades> list() {
        return aR.findAll();
    }

    @Override
    public void insert(Actividades l) {
        aR.save(l);
    }

    @Override
    public Actividades listId(int idActividades) {
        return aR.findById(idActividades).orElse(new Actividades());
    }

    @Override
    public void update(Actividades a) {
        aR.save(a);
    }

    @Override
    public void delete(int idActividades) {
        aR.deleteById(idActividades);
    }

    @Override
    public List<String[]> cantidadActividadesPorTipo() {
        return aR.cantidadActividadesPorTipo();
    }

    @Override
    public List<String[]> actividadesPorLeccion(int idLeccion) {
        return aR.actividadesPorLeccion(idLeccion);
    }
}
