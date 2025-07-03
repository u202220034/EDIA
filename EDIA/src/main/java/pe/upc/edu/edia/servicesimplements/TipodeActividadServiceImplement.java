package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.TipodeActividad;
import pe.upc.edu.edia.repositories.ITipodeActividadRepository;
import pe.upc.edu.edia.servicesinterfaces.ITipodeActividadService;

import java.util.List;

@Service
public class TipodeActividadServiceImplement implements ITipodeActividadService {

    @Autowired
    private ITipodeActividadRepository tpaR;

    @Override
    public List<TipodeActividad> list() {return tpaR.findAll();}

    @Override
    public void insert(TipodeActividad tpa) {tpaR.save(tpa);}

    @Override
    public TipodeActividad listId(int idTipodeActividad) {return tpaR.findById(idTipodeActividad).orElse(new TipodeActividad());}

    @Override
    public void update(TipodeActividad tpa) {tpaR.save(tpa);}

    @Override
    public void delete(int idTipodeActividad) {tpaR.deleteById(idTipodeActividad);}

    @Override
    public List<String[]> tiposPorLeccion(int idLeccion) {
        return tpaR.tiposPorLeccion(idLeccion);
    }


}
