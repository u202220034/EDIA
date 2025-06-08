package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.CantidadEstudiantesporCursoDTO;
import pe.upc.edu.edia.dtos.TipoUsuarioDTO;
import pe.upc.edu.edia.entities.TipoUsuario;
import pe.upc.edu.edia.servicesinterfaces.ITipoUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipousuarios")
public class TipoUsuarioController {
    @Autowired
    private ITipoUsuarioService tuS;
    @GetMapping
    public List<TipoUsuarioDTO> listar(){
        return tuS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoUsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody TipoUsuarioDTO tudto){
        ModelMapper m = new ModelMapper();
        TipoUsuario a = m.map(tudto, TipoUsuario.class);
        tuS.insert(a);
    }
    @GetMapping("/{idTipoUsuario}")
    public TipoUsuarioDTO listarId(@PathVariable("idTipoUsuario") int idTipoUsuario){
        ModelMapper m = new ModelMapper();
        TipoUsuarioDTO dto = m.map(tuS.listId(idTipoUsuario), TipoUsuarioDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody TipoUsuarioDTO tudto){
        ModelMapper m = new ModelMapper();
        TipoUsuario tu = m.map(tudto, TipoUsuario.class);
        tuS.update(tu);
    }
    @DeleteMapping("/{idTipoUsuario}")
    public void eliminar(@PathVariable("idTipoUsuario") Integer idTipoUsuario){ tuS.delete(idTipoUsuario); }



}
