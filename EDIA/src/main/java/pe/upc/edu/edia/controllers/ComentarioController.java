package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.ComentarioDTO;
import pe.upc.edu.edia.entities.Comentario;
import pe.upc.edu.edia.servicesinterfaces.IComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private IComentarioService comS;
    @GetMapping
    public List<ComentarioDTO> listaComentarios() {
        return comS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody ComentarioDTO comDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Comentario com = modelMapper.map(comDTO, Comentario.class);
        comS.insert(com);
    }
    @PutMapping
    public void modificar(@RequestBody ComentarioDTO comDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Comentario com = modelMapper.map(comDTO, Comentario.class);
        comS.update(com);
    }
    @DeleteMapping("/{idComentario}")
    public void eliminar(@PathVariable("idComentario")int idComentario) {comS.delete(idComentario);}
}
