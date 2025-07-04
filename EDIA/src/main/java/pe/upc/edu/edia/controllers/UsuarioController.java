package pe.upc.edu.edia.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.UsuarioDTO;
import pe.upc.edu.edia.entities.Usuario;
import pe.upc.edu.edia.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'ESTUDIANTE')")
    public List<UsuarioDTO> listar() {
        return uS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody UsuarioDTO uDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario u= modelMapper.map(uDTO, Usuario.class);
        u.setPassword(passwordEncoder.encode(uDTO.getPassword()));
        uS.insert(u);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody UsuarioDTO uDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario u= modelMapper.map(uDTO, Usuario.class);
        uS.update(u);
    }
    @DeleteMapping("/{idUsuario}")
    public void eliminar(@PathVariable("idUsuario") int idUsuario) { uS.delete(idUsuario); }

    @GetMapping("/{idUsuarios}")
    public UsuarioDTO ListarUsuarios(@PathVariable ("idUsuarios")int idUsuarios) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS.listId(idUsuarios), UsuarioDTO.class);
        return dto;
    }
}
