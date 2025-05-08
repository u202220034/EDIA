package pe.upc.edu.edia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.UsuarioDesafio;

import java.util.List;

@Repository
public interface IUsuarioDesafioRepository extends JpaRepository<UsuarioDesafio, Integer> {

    //Ver el id de los usuarios que participaron en desafios y sus puntajes
    @Query(value = "SELECT ud.id_usuario, dt.nombre_desafio, ud.puntaje " +
            "FROM usuario_desafio ud " +
            "JOIN desafio_temporal dt ON ud.id_desafio_temporal = dt.id_desafio_temporal " +
            "ORDER BY ud.id_usuario, dt.nombre_desafio",
            nativeQuery = true)
    public List<String[]> verUsuarioDesafio();
}
