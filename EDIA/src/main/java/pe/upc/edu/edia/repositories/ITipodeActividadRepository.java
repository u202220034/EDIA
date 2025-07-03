package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.TipodeActividad;

import java.util.List;

@Repository
public interface ITipodeActividadRepository extends JpaRepository<TipodeActividad, Integer> {

    @Query(value = "SELECT DISTINCT ta.nombre_tipode_actividad " +
            "FROM actividades a " +
            "INNER JOIN tipode_actividad ta ON a.id_tipode_actividad = ta.id_tipode_actividad " +
            "WHERE a.id_lecciones = :idLeccion", nativeQuery = true)
    List<String[]> tiposPorLeccion(@Param("idLeccion") int idLeccion);
}
