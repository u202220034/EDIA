package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.Publicacion;

@Repository
public interface IPublicacionRepository extends JpaRepository<Publicacion,Integer> {
}
