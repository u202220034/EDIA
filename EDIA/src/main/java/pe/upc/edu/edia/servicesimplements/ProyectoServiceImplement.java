package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.Proyecto;
import pe.upc.edu.edia.repositories.IProyectoRepository;
import pe.upc.edu.edia.servicesinterfaces.IProyectoService;

import java.util.List;

@Service
public class ProyectoServiceImplement implements IProyectoService {

    @Autowired
    private IProyectoRepository pR;

    @Override
    public List<Proyecto> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Proyecto p) {
        pR.save(p);
    }

    @Override
    public Proyecto listId(int idProyecto) {
        return pR.findById(idProyecto).orElse(new Proyecto());
    }

    @Override
    public void update(Proyecto p) {
        pR.save(p);
    }

    @Override
    public void delete(int idProyecto) {
        pR.deleteById(idProyecto);
    }

    @Override
    public List<String[]> encontrarProyectos() {
        return pR.encontrarproyectosporUsuario();
    }

    @Override
    public List<String[]> CantidadProyectosporUsuario() {
        return pR.cantidadproyectosporUsuario();
    }
}
