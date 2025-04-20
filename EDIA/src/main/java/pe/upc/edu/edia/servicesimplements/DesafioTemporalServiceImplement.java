package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.DesafioTemporal;
import pe.upc.edu.edia.repositories.IDesafioTemporalRepository;
import pe.upc.edu.edia.servicesinterfaces.IDesafioTemporalService;


import java.util.List;

@Service
public class DesafioTemporalServiceImplement implements IDesafioTemporalService {

    @Autowired
    private IDesafioTemporalRepository detr;

    @Override
    public List<DesafioTemporal> list() {return detr.findAll();}

    @Override
    public void insert(DesafioTemporal dt) {detr.save(dt);}

    @Override
    public DesafioTemporal listId(int idDesafioTemporal) {return detr.findById(idDesafioTemporal).orElse(new DesafioTemporal());}

    @Override
    public void update(DesafioTemporal dt) { detr.save(dt);}

    @Override
    public void delete(int idDesafioTemporal) { detr.deleteById(idDesafioTemporal); }


}
