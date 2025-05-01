package pe.upc.edu.edia.servicesinterfaces;

import pe.upc.edu.edia.entities.TipoUsuario;

import java.util.List;

public interface ITipoUsuarioService {
    public List<TipoUsuario> list();

    public void insert(TipoUsuario tpus);

    public TipoUsuario listId(int idTipoUsuario);
    public void update(TipoUsuario tpus);
    public void delete(int idTipoUsuario);


}
