package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.RetosDesafioDTO;
import pe.upc.edu.edia.entities.RetosDesafio;
import pe.upc.edu.edia.servicesinterfaces.IRetosDesafioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/retosdesafio")
public class RetosDesafioController {
    @Autowired
    private IRetosDesafioService rdS;

    @GetMapping
    public List<RetosDesafioDTO> listar(){
        return rdS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, RetosDesafioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody RetosDesafioDTO vDto){
        ModelMapper modelMapper = new ModelMapper();
        RetosDesafio rd= modelMapper.map(vDto, RetosDesafio.class);
        rdS.insert(rd);
    }
    @GetMapping("/{idRetosDesafio}")
    public RetosDesafioDTO listarId(@PathVariable("idRetosDesafio") int idRetosDesafio) {
        ModelMapper m = new ModelMapper();
        RetosDesafioDTO dto = m.map(rdS.listId(idRetosDesafio), RetosDesafioDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody RetosDesafioDTO aVersion) {
        ModelMapper m = new ModelMapper();
        RetosDesafio rd = m.map(aVersion, RetosDesafio.class);
        rdS.update(rd);
    }
    @DeleteMapping("/{idRetosDesafio}")
    public void eliminar(@PathVariable("idRetosDesafio") int idRetosDesafio) {
        rdS.delete(idRetosDesafio);
    }
}
