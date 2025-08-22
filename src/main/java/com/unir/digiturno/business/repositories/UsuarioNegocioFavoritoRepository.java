package com.unir.digiturno.business.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.unir.digiturno.business.models.entities.UsuarioNegocioFavorito;

public interface UsuarioNegocioFavoritoRepository extends CrudRepository<UsuarioNegocioFavorito, Long> {
    List<UsuarioNegocioFavorito> findByUsuarioId(Long usuarioId);
    List<UsuarioNegocioFavorito> findByNegocioId(Long negocioId);
    void deleteByUsuarioIdAndNegocioId(Long usuarioId, Long negocioId);
    boolean existsByUsuarioIdAndNegocioId(Long usuarioId, Long negocioId);
}
