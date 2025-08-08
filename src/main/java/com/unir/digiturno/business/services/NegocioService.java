package com.unir.digiturno.business.services;

import java.util.List;
import java.util.Optional;

import com.unir.digiturno.business.dto.NegocioListDTO;
import com.unir.digiturno.business.models.entities.Negocio;


public interface NegocioService {

    List<Negocio> findAll();
    
    List<NegocioListDTO> findAllWithDetails();

    Optional<Negocio> findById(Long id);
    
    List<Negocio> findByIdUsuario(Long idUsuario);

    Negocio save(Negocio negocio);

    Optional<Negocio> update(Negocio negocio, Long id);

    void remove(Long id);

}
