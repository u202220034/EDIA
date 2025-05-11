package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.Lecciones;

import java.util.List;

@Repository
public interface ILeccionesRepository extends JpaRepository<Lecciones, Integer> {

    @Query(value = "SELECT l.titulo, COUNT(*) " +
            "FROM actividades a " +
            "INNER JOIN lecciones l ON a.id_lecciones = l.id_lecciones " +
            "GROUP BY l.titulo", nativeQuery = true)
    List<String[]> cantidadActividadesPorLeccion();

    @Query(value = "SELECT DISTINCT l.titulo " +
            "FROM actividades a " +
            "INNER JOIN lecciones l ON a.id_lecciones = l.id_lecciones " +
            "WHERE a.estatus = true", nativeQuery = true)
    List<String[]> leccionesConActividadesActivas();
}
