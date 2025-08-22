package com.unir.digiturno.business.repositories;

import com.unir.digiturno.business.models.entities.Calificacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CalificacionRepository extends CrudRepository<Calificacion, Long> {
    List<Calificacion> findByNegocioId(Long negocioId);
    Optional<Calificacion> findByNegocioIdAndClienteId(Long negocioId, Long clienteId);
}
