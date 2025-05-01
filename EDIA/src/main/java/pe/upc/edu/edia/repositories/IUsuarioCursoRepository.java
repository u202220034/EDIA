package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.UsuarioCurso;

import java.util.List;

@Repository
public interface IUsuarioCursoRepository extends JpaRepository<UsuarioCurso,Integer> {
    @Query(value = "SELECT \n" +
            "    c.nombre_curso,\n" +
            "    COUNT(uc.id_usuario) AS cantidad_estudiantes\n" +
            "FROM \n" +
            "    curso c\n" +
            "JOIN \n" +
            "    usuario_curso uc ON c.id_curso = uc.id_curso\n" +
            "GROUP BY \n" +
            "    c.nombre_curso\n" +
            "ORDER BY \n" +
            "    cantidad_estudiantes DESC",nativeQuery = true)
    public List<String[]> cantidadEstudiantesporCurso();

    @Query(value = "SELECT \n" +
            "    u.username,\n" +
            "    c.nombre_curso,\n" +
            "    uc.estatus_curso || '%' AS porcentaje_completado\n" +
            "FROM \n" +
            "    usuario_curso uc\n" +
            "JOIN \n" +
            "    usuario u ON uc.id_usuario = u.id_usuario\n" +
            "JOIN \n" +
            "    curso c ON uc.id_curso = c.id_curso\n" +
            "WHERE \n" +
            "    uc.estatus_curso >= 100", nativeQuery = true)
    public List<String[]> porcentajeCompletado();
}
