package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.Foro;

@Repository
public interface IForoRepository extends JpaRepository<Foro, Integer> {
}
