package com.unir.digiturno.business.controllers;

import com.unir.digiturno.business.models.entities.Calificacion;
import com.unir.digiturno.business.response.ApiResponse;
import com.unir.digiturno.business.services.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    private CalificacionService service;

    @GetMapping("/negocio/{negocioId}")
    public ResponseEntity<ApiResponse<List<Calificacion>>> getByNegocio(@PathVariable Long negocioId) {
        List<Calificacion> calificaciones = service.findByNegocioId(negocioId);
        return ResponseEntity.ok(new ApiResponse<>(true, "Calificaciones del negocio", 2000, calificaciones));
    }

    @GetMapping("/negocio/{negocioId}/cliente/{clienteId}")
    public ResponseEntity<ApiResponse<Calificacion>> getByNegocioAndCliente(@PathVariable Long negocioId, @PathVariable Long clienteId) {
        Optional<Calificacion> calificacion = service.findByNegocioIdAndClienteId(negocioId, clienteId);
        return calificacion
                .map(c -> ResponseEntity.ok(new ApiResponse<>(true, "Calificación encontrada", 2000, c)))
                .orElseGet(() -> ResponseEntity.ok(new ApiResponse<>(false, "No existe calificación", 4040, null)));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Calificacion>> save(@RequestBody Calificacion calificacion) {
        Calificacion saved = service.save(calificacion);
        return ResponseEntity.ok(new ApiResponse<>(true, "Calificación guardada", 2001, saved));
    }
}


