
package com.unir.digiturno.business.controllers;

import com.unir.digiturno.business.models.entities.Servicio;
import com.unir.digiturno.business.repositories.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

// DTO para exponer los servicios en el formato esperado por el frontend
class ServicioDTO {
    public Long idServicio;
    public String nombreServicio;
    public Integer duracionMin;
    public Integer precio;
    public Long negocioId;

    public ServicioDTO(Servicio s) {
        this.idServicio = s.getId();
        this.nombreServicio = s.getNombre();
        this.duracionMin = s.getDuracionMin();
        this.precio = s.getPrecio();
        this.negocioId = s.getNegocioId();
    }
}

@RestController
@RequestMapping("/negocio/{negocioId}/servicios")
public class ServicioController {
    @Autowired
    private ServicioRepository servicioRepository;

    @GetMapping
    public ResponseEntity<List<ServicioDTO>> getServiciosByNegocio(@PathVariable("negocioId") Long negocioId) {
        List<Servicio> servicios = servicioRepository.findByNegocioId(negocioId);
        List<ServicioDTO> dtos = servicios.stream().map(ServicioDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }
}
