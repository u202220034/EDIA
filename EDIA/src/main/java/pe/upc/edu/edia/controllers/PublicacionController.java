package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.PublicacionDTO;
import pe.upc.edu.edia.dtos.comentariosConTitulosPublicacionDTO;
import pe.upc.edu.edia.entities.Publicacion;
import pe.upc.edu.edia.servicesinterfaces.IPublicacionService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/publicacion")
public class PublicacionController {
    @Autowired
    private IPublicacionService pubS;
    @GetMapping
    public List<PublicacionDTO> listar() {
        return pubS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, PublicacionDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody PublicacionDTO pubDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Publicacion pub = modelMapper.map(pubDTO, Publicacion.class);
        pubS.insert(pub);
    }
    @PutMapping
    public void modificar(@RequestBody PublicacionDTO pubDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Publicacion pub = modelMapper.map(pubDTO, Publicacion.class);
        pubS.update(pub);
    }
    @DeleteMapping("/{idPublicacion}")
    public void eliminar(@PathVariable ("idPublicacion")int idPublicacion) {pubS.delete(idPublicacion);}

    @GetMapping("/comentariosConTitulosPublicaciones")
    public List<comentariosConTitulosPublicacionDTO> comentariosConTitulosPublicaciones() {
        List<String[]> lista=pubS.comentariosConTitulosPublicacion();
        List<comentariosConTitulosPublicacionDTO>listaDTO=new ArrayList<>();
        for (String[] columna:lista) {
            comentariosConTitulosPublicacionDTO dto=new comentariosConTitulosPublicacionDTO();
            dto.setId_comentario(Integer.parseInt(columna[0]));
            dto.setTitulo(columna[1]);
            dto.setContenido(columna[2]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/{idPublicacion}")
    public PublicacionDTO listId(@PathVariable ("idPublicacion")int idPublicacion) {
        ModelMapper m = new ModelMapper();
        PublicacionDTO dto = m.map(pubS.listId(idPublicacion), PublicacionDTO.class);
        return dto;
    }
}
