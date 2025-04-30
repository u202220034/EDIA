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
    public Usuario findOneByUsuario(String usuario);

    @Query("select count(u.usuario) from Usuario u where u.usuario =:usuario")
    public int buscarUsername(@Param("usuario") String nombre);


    @Transactional
    @Modifying
    @Query(value = "insert into tipousuarios (tipousuario, user_id) VALUES (:tipousuario, :user_id)", nativeQuery = true)
    public void insRol(@Param("tipousuario") String authority, @Param("user_id") Long user_id);
}
