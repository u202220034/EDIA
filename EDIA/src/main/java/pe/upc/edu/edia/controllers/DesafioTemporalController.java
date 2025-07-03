package pe.upc.edu.edia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.edia.dtos.DesafioTemporalDTO;
import pe.upc.edu.edia.dtos.EncontarDesafioExpiradoDTO;

import pe.upc.edu.edia.entities.DesafioTemporal;
import pe.upc.edu.edia.servicesinterfaces.IDesafioTemporalService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/desafiotemporal")
public class DesafioTemporalController {
    @Autowired
    private IDesafioTemporalService dtS;
    @GetMapping
    public List<DesafioTemporalDTO> listar(){
        return dtS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DesafioTemporalDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody DesafioTemporalDTO tudto){
        ModelMapper m = new ModelMapper();
        DesafioTemporal a = m.map(tudto, DesafioTemporal.class);
        dtS.insert(a);
    }
    @GetMapping("/{idDesafioTemporal}")
    public DesafioTemporalDTO listarId(@PathVariable("idDesafioTemporal") int idDesafioTemporal){
        ModelMapper m = new ModelMapper();
        DesafioTemporalDTO dto = m.map(dtS.listId(idDesafioTemporal), DesafioTemporalDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody DesafioTemporalDTO tudto){
        ModelMapper m = new ModelMapper();
        DesafioTemporal tu = m.map(tudto, DesafioTemporal.class);
        dtS.update(tu);
    }
    @DeleteMapping("/{idDesafioTemporal}")
    public void eliminar(@PathVariable("idDesafioTemporal") int idDesafioTemporal){ dtS.delete(idDesafioTemporal);}

    @GetMapping("/expirados")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<EncontarDesafioExpiradoDTO> obtenerExpirados() {
        List<String[]> datos = dtS.verDesafioExpirado();
        List<EncontarDesafioExpiradoDTO> resultado = new ArrayList<>();

        for (String[] fila : datos) {
            EncontarDesafioExpiradoDTO dto = new EncontarDesafioExpiradoDTO();
            dto.setIdDesafioTemporal(Integer.parseInt(fila[0]));
            dto.setNombreDesafio(fila[1]);
            dto.setFechaInicio(LocalDate.parse(fila[2]));
            dto.setFechaCulminacion(LocalDate.parse(fila[3]));
            resultado.add(dto);
        }

        return resultado;
    }

}
