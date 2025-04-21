package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.Categoria;
import pe.upc.edu.edia.repositories.ICategoriaRepository;
import pe.upc.edu.edia.servicesinterfaces.ICategoriaService;

import java.util.List;

@Service
public class CategoriaServiceImplement implements ICategoriaService {

    @Autowired
    private ICategoriaRepository catR;

    @Override
    public List<Categoria> list() {return catR.findAll();}

    @Override
    public void insert(Categoria cat) {catR.save(cat);}

    @Override
    public Categoria listId(int idCategoria) {return catR.findById(idCategoria).orElse(new Categoria());}

    @Override
    public void update(Categoria cat) {catR.save(cat);}

    @Override
    public void delete(int idCategoria) {catR.deleteById(idCategoria);}


}
