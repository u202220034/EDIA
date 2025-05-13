package pe.upc.edu.edia.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.CursoDTO;
import pe.upc.edu.edia.entities.Curso;
import pe.upc.edu.edia.servicesinterfaces.ICursoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private ICursoService curS;
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CursoDTO> Listar(){
        return curS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CursoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody CursoDTO curDTO){
        ModelMapper m = new ModelMapper();
        Curso a = m.map(curDTO, Curso.class);
        curS.insert(a);
    }
    @GetMapping("/{idCursos}")
    public CursoDTO ListarCursos(@PathVariable ("idCurso")int idCurso){
        ModelMapper m = new ModelMapper();
        CursoDTO dto = m.map(curS.listId(idCurso), CursoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody CursoDTO curDTO){
        ModelMapper m = new ModelMapper();
        Curso v = m.map(curDTO, Curso.class);
        curS.update(v);
    }
    @DeleteMapping("/{idCurso}")
    public void eliminar(@PathVariable("idCurso") int idCurso) {
        curS.delete(idCurso);
    }

}
