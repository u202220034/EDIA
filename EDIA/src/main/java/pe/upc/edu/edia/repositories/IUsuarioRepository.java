package pe.upc.edu.edia.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.edia.entities.Usuario;
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findOneByUsername(String usuario);

    @Query("select count(u.username) from Usuario u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);


    @Transactional
    @Modifying
    @Query(value = "insert into tipousuarios (tipousuario, user_id) VALUES (:tipousuario, :user_id)", nativeQuery = true)
    public void insRol(@Param("tipousuario") String authority, @Param("user_id") Long user_id);
}
