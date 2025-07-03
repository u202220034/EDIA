package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.Proyecto;

import java.util.List;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Integer> {

    @Query(value ="SELECT \n" +
            "  TO_CHAR(p.fecha_creacion, 'YYYY-MM') AS Mes,\n" +
            "  COUNT(p.id_proyecto) AS Total_Proyectos\n" +
            "FROM \n" +
            "  proyecto p\n" +
            "GROUP BY \n" +
            "  TO_CHAR(p.fecha_creacion, 'YYYY-MM')\n" +
            "ORDER BY \n" +
            "  Mes;",nativeQuery = true)
    public List<String[]> proyectosPorFechaCreacion();

    @Query(value ="SELECT \n" +
            "u.id_usuario,\n" +
            "u.username AS Nombre_Usuario,\n" +
            "COUNT(p.id_proyecto) AS Cantidad_de_Proyectos_Creados\n" +
            "FROM\n" +
            "usuario u\n" +
            "LEFT JOIN\n" +
            "proyecto p ON u.id_usuario = p.id_usuario\n" +
            "GROUP BY\n" +
            "u.id_usuario, u.username\n" +
            "ORDER BY\n" +
            "Cantidad_de_Proyectos_Creados DESC;",nativeQuery = true)
    public List<String[]> cantidadproyectosporUsuario();

}
