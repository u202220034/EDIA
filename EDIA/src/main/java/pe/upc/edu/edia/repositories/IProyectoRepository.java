package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.Proyecto;

import java.util.List;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Integer> {

    @Query(value ="SELECT\n" +
            "    u.username AS Nombre_Usuario_Creador,\n" +
            "    p.nombre_proyecto\n" +
            "FROM\n" +
            "    proyecto p\n" +
            "JOIN\n" +
            "    usuario u ON p.id_usuario = u.id_usuario",nativeQuery = true)
    public List<String[]> encontrarproyectosporUsuario();

    @Query(value ="SELECT\n" +
            "    u.id_usuario,\n" +
            "    u.username AS Nombre_Usuario,\n" +
            "    COUNT(p.id_proyecto) AS Cantida_dProyectos_Creados\n" +
            "FROM\n" +
            "    usuario u\n" +
            "LEFT JOIN\n" +
            "    proyecto p ON u.id_usuario = p.id_usuario\n" +
            "GROUP BY\n" +
            "    u.id_usuario, u.username\n" +
            "ORDER BY\n" +
            "    Cantida_dProyectos_Creados DESC",nativeQuery = true)
    public List<String[]> cantidadproyectosporUsuario();

}
