package com.unir.digiturno.business.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unir.digiturno.business.models.entities.UsuarioNegocioFavorito;
import com.unir.digiturno.business.repositories.UsuarioNegocioFavoritoRepository;

@Service
public class UsuarioNegocioFavoritoServiceImpl implements UsuarioNegocioFavoritoService {

    private final UsuarioNegocioFavoritoRepository repository;

    public UsuarioNegocioFavoritoServiceImpl(UsuarioNegocioFavoritoRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<UsuarioNegocioFavorito> findByUsuarioId(Long usuarioId) {
        return repository.findByUsuarioId(usuarioId);
    }

    @Override
    @Transactional
    public Optional<UsuarioNegocioFavorito> addFavorito(Long usuarioId, Long negocioId) {
        if (repository.existsByUsuarioIdAndNegocioId(usuarioId, negocioId)) {
            return Optional.empty();
        }
        UsuarioNegocioFavorito favorito = new UsuarioNegocioFavorito();
        favorito.setUsuarioId(usuarioId);
        favorito.setNegocioId(negocioId);
        favorito.setFechaAgregado(LocalDateTime.now());
        return Optional.of(repository.save(favorito));
    }

    @Override
    @Transactional
    public void removeFavorito(Long usuarioId, Long negocioId) {
        repository.deleteByUsuarioIdAndNegocioId(usuarioId, negocioId);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean isFavorito(Long usuarioId, Long negocioId) {
        return repository.existsByUsuarioIdAndNegocioId(usuarioId, negocioId);
    }
}
