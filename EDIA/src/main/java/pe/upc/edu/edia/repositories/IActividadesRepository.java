package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.Actividades;

import java.util.List;

@Repository
public interface IActividadesRepository extends JpaRepository<Actividades, Integer> {

    @Query(value = "SELECT ta.nombre_tipode_actividad, COUNT(*) " +
            "FROM actividades a " +
            "INNER JOIN tipode_actividad ta ON a.id_tipode_actividad = ta.id_tipode_actividad " +
            "GROUP BY ta.nombre_tipode_actividad", nativeQuery = true)
    List<String[]> cantidadActividadesPorTipo();

    @Query(value = "SELECT l.titulo, ta.nombre_tipode_actividad, a.estatus " +
            "FROM actividades a " +
            "INNER JOIN lecciones l ON a.id_lecciones = l.id_lecciones " +
            "INNER JOIN tipode_actividad ta ON a.id_tipode_actividad = ta.id_tipode_actividad " +
            "WHERE a.id_lecciones = :idLeccion", nativeQuery = true)
    List<String[]> actividadesPorLeccion(@Param("idLeccion") int idLeccion);
}
