package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.TipoUsuario;
import pe.upc.edu.edia.repositories.ITipoUsuarioRepository;
import pe.upc.edu.edia.servicesinterfaces.ITipoUsuarioService;

import java.util.List;

@Service
public class TipoUsuarioServiceImplement implements ITipoUsuarioService {

    @Autowired
    private ITipoUsuarioRepository tpuR;

    @Override
    public List<TipoUsuario> list() {return tpuR.findAll();}

    @Override
    public void insert(TipoUsuario tu) {tpuR.save(tu);}

    @Override
    public TipoUsuario listId(int idTipoUsuario) {return tpuR.findById(idTipoUsuario).orElse(new TipoUsuario());}

    @Override
    public void update(TipoUsuario tu) { tpuR.save(tu);}

    @Override
    public void delete(int idTipoUsuario) { tpuR.deleteById(idTipoUsuario); }

}
