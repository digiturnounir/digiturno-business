package com.unir.digiturno.business.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unir.digiturno.business.dto.NegocioListDTO;
import com.unir.digiturno.business.models.entities.Negocio;
import com.unir.digiturno.business.repositories.NegocioRepository;



@Service
public class NegocioServiceImpl implements NegocioService {

    private final NegocioRepository repository;

    public NegocioServiceImpl(NegocioRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Negocio> findAll() {
        return (List<Negocio>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<NegocioListDTO> findAllWithDetails() {
        return repository.findAllWithCategoryAndRating();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Negocio> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Negocio> findByIdUsuario(Long idUsuario) {
        return repository.findByIdUsuario(idUsuario);
    }

    @Override
    @Transactional
    public Negocio save(Negocio negocio) {
        negocio.setFechcrea(LocalDateTime.now());
        
        // Asignar valores por defecto si están vacíos
        if (negocio.getDescripcion() == null || negocio.getDescripcion().trim().isEmpty()) {
            negocio.setDescripcion("Descripción pendiente de actualizar");
        }
        
        if (negocio.getUrlImagen() == null || negocio.getUrlImagen().trim().isEmpty()) {
            negocio.setUrlImagen("https://images.unsplash.com/photo-1557804506-669a67965ba0?w=300");
        }
        
        if (negocio.getDuracionCita() == null) {
            negocio.setDuracionCita(60); // 60 minutos por defecto
        }
        
        if (negocio.getHoraInicio() == null || negocio.getHoraInicio().trim().isEmpty()) {
            negocio.setHoraInicio("09:00");
        }
        
        if (negocio.getHoraFin() == null || negocio.getHoraFin().trim().isEmpty()) {
            negocio.setHoraFin("18:00");
        }
        
        // Si no tiene categoría asignada, asignar categoría "General" (ID 1)
        if (negocio.getIdCategoria() == null) {
            negocio.setIdCategoria(1L);
        }
        
        return repository.save(negocio);
    }

    @Override
    @Transactional
    public Optional<Negocio> update(Negocio negocio, Long id) {
        Optional<Negocio> o = this.findById(id);
        if (o.isPresent()) {
            Negocio negocioDb = o.get();
            negocioDb.setNombre(negocio.getNombre());
            negocioDb.setDireccion(negocio.getDireccion());
            negocioDb.setIdCategoria(negocio.getIdCategoria());
            negocioDb.setFechcrea(negocio.getFechcrea());
            negocioDb.setIdUsuario(negocio.getIdUsuario());
            negocioDb.setDescripcion(negocio.getDescripcion());
            negocioDb.setUrlImagen(negocio.getUrlImagen());
            negocioDb.setDuracionCita(negocio.getDuracionCita());
            negocioDb.setHoraInicio(negocio.getHoraInicio());
            negocioDb.setHoraFin(negocio.getHoraFin());

            return Optional.of(repository.save(negocioDb));
        }
        return Optional.empty();
    }

    @Override
    @Transactional
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
