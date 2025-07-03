package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSException;
import pe.upc.edu.edia.dtos.ForoDTO;
import pe.upc.edu.edia.dtos.ListarForoPorTipoDTO;
import pe.upc.edu.edia.entities.Foro;
import pe.upc.edu.edia.servicesinterfaces.IForoService;

import java.util.ArrayList;
import java.util.Date;
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

    @GetMapping("/listarForoPorTipo/{tipo}")
    public List<ListarForoPorTipoDTO> ListarForoPorTipo(@PathVariable String tipo) {
        List<String[]>lista=forS.listarForosPorTipo(tipo);
        List<ListarForoPorTipoDTO>listaDTO= new ArrayList<>();
        for (String[] columna:lista) {
            ListarForoPorTipoDTO dto = new ListarForoPorTipoDTO();
            dto.setNombre_foro(columna[0]);
            dto.setTipo_foro(columna[1]);
            dto.setId_foro(Integer.parseInt(columna[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
