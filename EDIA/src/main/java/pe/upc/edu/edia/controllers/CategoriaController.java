package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.CategoriaDTO;
import pe.upc.edu.edia.entities.Categoria;
import pe.upc.edu.edia.servicesinterfaces.ICategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private ICategoriaService caS;
    @GetMapping
    public List<CategoriaDTO> listar() {
        return caS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CategoriaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody CategoriaDTO cadto){
        ModelMapper m = new ModelMapper();
        Categoria a = m.map(cadto, Categoria.class);
        caS.insert(a);
    }
    @GetMapping("/{idCategoria}")
    public CategoriaDTO ListarId(@PathVariable ("idCategoria")int idCategoria){
        ModelMapper m = new ModelMapper();
        CategoriaDTO dto = m.map(caS.listId(idCategoria), CategoriaDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody CategoriaDTO cadto){
        ModelMapper m = new ModelMapper();
        Categoria ca = m.map(cadto, Categoria.class);
        caS.update(ca);
    }
    @DeleteMapping("/{idCategoria}")
    public void eliminar(@PathVariable("idCategoria")int idCategoria){caS.delete(idCategoria);}

}
