package pe.upc.edu.edia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pe.upc.edu.edia.entities.Usuario;
import pe.upc.edu.edia.repositories.IUsuarioRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class JwtUserDetailsServiceImplement implements UserDetailsService {

    @Autowired
    private IUsuarioRepository repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usu = repo.findOneByUsername(username);

        if (usu == null) {
            throw new UsernameNotFoundException(String.format("User not exists", username));
        }

        List<GrantedAuthority> tipousuario = new ArrayList<>();

        usu.getTipoUsuarios().forEach(tipoUsuario -> {
            tipousuario.add(new SimpleGrantedAuthority(tipoUsuario.getTipoUsuario()));
        });

        UserDetails ud = new org.springframework.security.core.userdetails.User(usu.getUsername(), usu.getPassword(), tipousuario);

        return ud;
    }
}
