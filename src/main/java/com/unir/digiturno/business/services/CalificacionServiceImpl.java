package com.unir.digiturno.business.services;

import com.unir.digiturno.business.models.entities.Calificacion;
import com.unir.digiturno.business.repositories.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CalificacionServiceImpl implements CalificacionService {

    @Autowired
    private CalificacionRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Calificacion> findByNegocioId(Long negocioId) {
        return repository.findByNegocioId(negocioId);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Calificacion> findByNegocioIdAndClienteId(Long negocioId, Long clienteId) {
        return repository.findByNegocioIdAndClienteId(negocioId, clienteId);
    }

    @Override
    @Transactional
    public Calificacion save(Calificacion calificacion) {
        Optional<Calificacion> existente = repository.findByNegocioIdAndClienteId(
            calificacion.getNegocioId(), calificacion.getClienteId()
        );
        if (existente.isPresent()) {
            Calificacion actual = existente.get();
            actual.setPuntaje(calificacion.getPuntaje());
            actual.setComentario(calificacion.getComentario());
            actual.setFecha(calificacion.getFecha());
            return repository.save(actual);
        } else {
            return repository.save(calificacion);
        }
    }
}
