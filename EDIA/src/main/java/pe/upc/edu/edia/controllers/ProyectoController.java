package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.CantidadProyectoporUsuarioDTO;
import pe.upc.edu.edia.dtos.CantidadProyectosporFechaCreacionDTO;
import pe.upc.edu.edia.dtos.ProyectoDTO;
import pe.upc.edu.edia.entities.Proyecto;
import pe.upc.edu.edia.servicesinterfaces.IProyectoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {
    @Autowired
    private IProyectoService pS;
    @GetMapping
    public List<ProyectoDTO> listar(){
        return pS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, ProyectoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody ProyectoDTO pDto) {
        ModelMapper modelMapper = new ModelMapper();
        Proyecto p= modelMapper.map(pDto, Proyecto.class);
        pS.insert(p);
    }
    @GetMapping("/{idProyecto}")
    public ProyectoDTO listarId(@PathVariable("idProyecto") int idProyecto) {
        ModelMapper m = new ModelMapper();
        ProyectoDTO dto = m.map(pS.listId(idProyecto), ProyectoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody ProyectoDTO proyectoDTO) {
        ModelMapper m = new ModelMapper();
        Proyecto p = m.map(proyectoDTO, Proyecto.class);
        pS.update(p);
    }
    @DeleteMapping("/{idProyecto}")
    public void eliminar(@PathVariable("idProyecto") int idProyecto) {
        pS.delete(idProyecto);
    }

    @GetMapping("/CantidadProyectosporFechas")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<CantidadProyectosporFechaCreacionDTO> proyectosPorFechaCreacion() {
        List<String[]> lista=pS.proyectosPorFechaCreacion();
        List<CantidadProyectosporFechaCreacionDTO> listaDto=new ArrayList<>();
        for (String[] columna : lista){
            CantidadProyectosporFechaCreacionDTO dto=new CantidadProyectosporFechaCreacionDTO();
            dto.setMes(columna[0]);
            dto.setTotalProyectos(Integer.parseInt(columna[1]));
            listaDto.add(dto);
        }
        return listaDto;
    }

    @GetMapping("/CantidadProyectosUsus")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<CantidadProyectoporUsuarioDTO> CantidadProyectos(){
        List<String[]> lista=pS.CantidadProyectosporUsuario();
        List<CantidadProyectoporUsuarioDTO> ctlistaDto=new ArrayList<>();
        for (String[] columna : lista){
            CantidadProyectoporUsuarioDTO dto=new CantidadProyectoporUsuarioDTO();
            dto.setIdUsuario(Integer.parseInt(columna[0]));
            dto.setNombreUsuario(columna[1]);
            dto.setCantidad(Integer.parseInt(columna[2]));
            ctlistaDto.add(dto);
        }
        return ctlistaDto;
    }

}
