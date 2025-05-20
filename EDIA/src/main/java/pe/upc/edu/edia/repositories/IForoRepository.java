package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.Foro;

import java.util.List;

@Repository
public interface IForoRepository extends JpaRepository<Foro, Integer> {
    @Query(value="SELECT id_foro, nombre_foro, tipo_foro \n"+
            "FROM foro \n"+
            "WHERE tipo_foro = :tipo", nativeQuery = true)
    public List<String[]> listarForosPorTipo(@Param("tipo") String tipo);
}
