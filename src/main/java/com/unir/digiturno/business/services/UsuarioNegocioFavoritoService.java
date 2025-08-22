package com.unir.digiturno.business.services;

import java.util.List;
import java.util.Optional;

import com.unir.digiturno.business.models.entities.UsuarioNegocioFavorito;

public interface UsuarioNegocioFavoritoService {
    List<UsuarioNegocioFavorito> findByUsuarioId(Long usuarioId);
    Optional<UsuarioNegocioFavorito> addFavorito(Long usuarioId, Long negocioId);
    void removeFavorito(Long usuarioId, Long negocioId);
    boolean isFavorito(Long usuarioId, Long negocioId);
}
