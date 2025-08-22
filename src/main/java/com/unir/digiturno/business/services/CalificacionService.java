package com.unir.digiturno.business.services;

import com.unir.digiturno.business.models.entities.Calificacion;

import java.util.List;
import java.util.Optional;

public interface CalificacionService {
    List<Calificacion> findByNegocioId(Long negocioId);
    Optional<Calificacion> findByNegocioIdAndClienteId(Long negocioId, Long clienteId);
    Calificacion save(Calificacion calificacion);
}
