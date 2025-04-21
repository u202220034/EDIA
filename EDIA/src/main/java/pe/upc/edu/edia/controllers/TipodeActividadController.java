package pe.upc.edu.edia.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.TipodeActividadDTO;
import pe.upc.edu.edia.entities.TipodeActividad;
import pe.upc.edu.edia.servicesinterfaces.ITipodeActividadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipodeActividad")
public class TipodeActividadController {
    @Autowired
    private ITipodeActividadService tpaS;
    @GetMapping
    public List<TipodeActividadDTO> listar() {
        return tpaS.list().stream().map(x -> {
            ModelMapper  m = new ModelMapper();
            return m.map(x, TipodeActividadDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody TipodeActividadDTO tpadto){
        ModelMapper m = new ModelMapper();
        TipodeActividad a = m.map(tpadto, TipodeActividad.class);
        tpaS.insert(a);
    }

    @GetMapping("/{idTipodeActividad}")
    public TipodeActividadDTO ListarId(@PathVariable ("idTipodeActividad")int idTipodeActividad){
        ModelMapper m = new ModelMapper();
        TipodeActividadDTO dto = m.map(tpaS.listId(idTipodeActividad), TipodeActividadDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody TipodeActividadDTO tpadto){
        ModelMapper m = new ModelMapper();
        TipodeActividad tpa = m.map(tpadto, TipodeActividad.class);
        tpaS.update(tpa);
    }
    @DeleteMapping("/{idTipodeActividad}")
    public void eliminar(@PathVariable("idTipodeActividad")int idTipodeActividad){tpaS.delete(idTipodeActividad);}
}
