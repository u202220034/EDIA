package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.ActividadesDTO;
import pe.upc.edu.edia.dtos.ActividadesDentroDeLeccionDTO;
import pe.upc.edu.edia.dtos.ActividadesPorTipoDTO;
import pe.upc.edu.edia.entities.Actividades;
import pe.upc.edu.edia.servicesinterfaces.IActividadesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Actividades")
public class ActividadesController {

    @Autowired
    private IActividadesService aS;
    @GetMapping
    public List<ActividadesDTO> listar() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ActividadesDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody ActividadesDTO adto){
        ModelMapper m = new ModelMapper();
        Actividades a = m.map(adto, Actividades.class);
        aS.insert(a);
    }

    @GetMapping("/{idActividades}")
    public ActividadesDTO ListarId(@PathVariable ("idActividades")int idActividades){
        ModelMapper m = new ModelMapper();
        ActividadesDTO dto = m.map(aS.listId(idActividades), ActividadesDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody ActividadesDTO adto){
        ModelMapper m = new ModelMapper();
        Actividades a = m.map(adto, Actividades.class);
        aS.update(a);
    }
    @DeleteMapping("/{idActividades}")
    public void eliminar(@PathVariable("idActividades")int idActividades){aS.delete(idActividades);}

        @GetMapping("/cantidadportipo")
    public List<ActividadesPorTipoDTO> cantidadActividadesPorTipo() {
        return aS.cantidadActividadesPorTipo().stream().map(obj ->
                new ActividadesPorTipoDTO((String) obj[0], Long.parseLong(obj[1].toString()))
        ).collect(Collectors.toList());
    }

    @GetMapping("/porleccion/{id}")
    public List<ActividadesDentroDeLeccionDTO> porLeccion(@PathVariable("id") int id) {
        return aS.actividadesPorLeccion(id).stream().map(obj ->
                new ActividadesDentroDeLeccionDTO((String) obj[0], (String) obj[1], Boolean.parseBoolean(obj[2].toString()))
        ).collect(Collectors.toList());
    }

}
