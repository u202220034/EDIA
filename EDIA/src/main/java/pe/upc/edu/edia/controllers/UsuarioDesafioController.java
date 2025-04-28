package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.UsuarioDesafioDTO;
import pe.upc.edu.edia.entities.UsuarioDesafio;
import pe.upc.edu.edia.servicesinterfaces.IUsuarioDesafioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuariosdesafios")
public class UsuarioDesafioController {
    @Autowired
    private IUsuarioDesafioService udS;

    @GetMapping
    public List<UsuarioDesafioDTO> listar(){
        return udS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, UsuarioDesafioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody UsuarioDesafioDTO udDto){
        ModelMapper modelMapper = new ModelMapper();
        UsuarioDesafio v= modelMapper.map(udDto, UsuarioDesafio.class);
        udS.insert(v);
    }
    @GetMapping("/{idUsuarioDesafio}")
    public UsuarioDesafioDTO listarId(@PathVariable("idUsuarioDesafio") int idVersion) {
        ModelMapper m = new ModelMapper();
        UsuarioDesafioDTO dto = m.map(udS.listId(idVersion), UsuarioDesafioDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody UsuarioDesafioDTO aUsuarioDesafio) {
        ModelMapper m = new ModelMapper();
        UsuarioDesafio ud = m.map(aUsuarioDesafio, UsuarioDesafio.class);
        udS.update(ud);
    }
    @DeleteMapping("/{idUsuarioDesafio}")
    public void eliminar(@PathVariable("idUsuarioDesafio") int idUsuarioDesafio) {
        udS.delete(idUsuarioDesafio);
    }
}
