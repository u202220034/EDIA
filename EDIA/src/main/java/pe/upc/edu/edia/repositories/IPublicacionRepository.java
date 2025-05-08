package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.Publicacion;

import java.util.List;

@Repository
public interface IPublicacionRepository extends JpaRepository<Publicacion,Integer> {
    @Query(value="SELECT c.id_comentario, c.contenido, p.titulo \n"+
            "FROM comentario c\n"+
            "JOIN publicacion p ON c.id_publicacion = p.id_publicacion",nativeQuery = true)
    public List<String[]> comentariosConTitulosPublicacion();
}
