package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.CantidadEstudiantesporCursoDTO;
import pe.upc.edu.edia.dtos.UsuarioCursoDTO;
import pe.upc.edu.edia.entities.UsuarioCurso;
import pe.upc.edu.edia.servicesinterfaces.IUsuarioCursoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarioscursos")
public class UsuarioCursoController {
    @Autowired
    private IUsuarioCursoService ucS;
    @GetMapping
    public List<UsuarioCursoDTO> listar(){
        return ucS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, UsuarioCursoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody UsuarioCursoDTO ucDTO) {
        ModelMapper modelMapper = new ModelMapper();
        UsuarioCurso uc= modelMapper.map(ucDTO, UsuarioCurso.class);
        ucS.insert(uc);
    }
    @PutMapping
    public void modificar(@RequestBody UsuarioCursoDTO ucDTO) {
        ModelMapper modelMapper = new ModelMapper();
        UsuarioCurso uc= modelMapper.map(ucDTO, UsuarioCurso.class);
        ucS.update(uc);
    }
    @DeleteMapping("/{idUsuarioCurso}")
    public void eliminar(@PathVariable("idUsuarioCurso")int idUsuarioCurso) {ucS.delete(idUsuarioCurso);}

    @GetMapping("/CantidadEstudianteporCurso")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CantidadEstudiantesporCursoDTO> CantidadEstudiantes(){
        List<String[]> lista=ucS.cantidadusuarioxcurso();
        List<CantidadEstudiantesporCursoDTO> listaDto=new ArrayList<>();
        for (String[] columna : lista){
            CantidadEstudiantesporCursoDTO dto=new CantidadEstudiantesporCursoDTO();
            dto.setNombreCurso(columna[0]);
            dto.setCantidadEstudiantes(Integer.parseInt(columna[1]));
            listaDto.add(dto);

        }
        return listaDto;
    }
}
