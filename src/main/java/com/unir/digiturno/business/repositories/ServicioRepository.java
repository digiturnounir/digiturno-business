package com.unir.digiturno.business.repositories;

import com.unir.digiturno.business.models.entities.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
    List<Servicio> findByNegocioId(Long negocioId);
}
