package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.LeccionesDTO;
import pe.upc.edu.edia.entities.Lecciones;
import pe.upc.edu.edia.servicesinterfaces.ILeccionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Lecciones")
public class LeccionesController {
    @Autowired
    private ILeccionesService lS;
    @GetMapping
    public List<LeccionesDTO> listar() {
        return lS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LeccionesDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody LeccionesDTO ldto){
        ModelMapper m = new ModelMapper();
        Lecciones a = m.map(ldto, Lecciones.class);
        lS.insert(a);
    }

    @GetMapping("/{idLecciones}")
    public LeccionesDTO ListarId(@PathVariable ("idLecciones")int idLecciones){
        ModelMapper m = new ModelMapper();
        LeccionesDTO dto = m.map(lS.listId(idLecciones), LeccionesDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody LeccionesDTO ldto){
        ModelMapper m = new ModelMapper();
        Lecciones tpa = m.map(ldto, Lecciones.class);
        lS.update(tpa);
    }
    @DeleteMapping("/{idLecciones}")
    public void eliminar(@PathVariable("idLecciones")int idLecciones){lS.delete(idLecciones);}
}
