package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.ParticipacionDeEstudiantesPorDesafiosDTO;
import pe.upc.edu.edia.dtos.UsuarioDesafioDTO;
import pe.upc.edu.edia.entities.UsuarioDesafio;
import pe.upc.edu.edia.servicesinterfaces.IUsuarioDesafioService;

import java.util.ArrayList;
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


    @GetMapping("/participaciones")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<ParticipacionDeEstudiantesPorDesafiosDTO> obtenerParticipaciones() {
        List<String[]> datos = udS.verUsuarioDesafio();
        List<ParticipacionDeEstudiantesPorDesafiosDTO> resultado = new ArrayList<>();

        for (String[] fila : datos) {
            ParticipacionDeEstudiantesPorDesafiosDTO dto = new ParticipacionDeEstudiantesPorDesafiosDTO();
            dto.setIdUsuario(Integer.parseInt(fila[0]));
            dto.setNombreDesafio(fila[1]);
            dto.setPuntaje(Float.parseFloat(fila[2]));
            resultado.add(dto);
        }

        return resultado;
    }

}
