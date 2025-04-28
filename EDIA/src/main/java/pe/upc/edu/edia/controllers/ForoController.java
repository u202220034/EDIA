package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.ForoDTO;
import pe.upc.edu.edia.entities.Foro;
import pe.upc.edu.edia.servicesinterfaces.IForoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/foro")
public class ForoController {
    @Autowired
    private IForoService forS;
    @GetMapping
    public List<Foro> listar() {
        return forS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,Foro.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody ForoDTO forDTO) {
        ModelMapper m = new ModelMapper();
        Foro f = m.map(forDTO,Foro.class);
        forS.insert(f);
    }
    @PutMapping
    public void modificar(@RequestBody ForoDTO forDTO) {
        ModelMapper m = new ModelMapper();
        Foro f = m.map(forDTO,Foro.class);
        forS.update(f);
    }
    @DeleteMapping("/{idForo}")
    public void eliminar(@PathVariable ("idForo") int idForo) {forS.delete(idForo);}
}
