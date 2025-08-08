package com.unir.digiturno.business.services;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.unir.digiturno.business.models.entities.CategoriaNegocio;
import com.unir.digiturno.business.repositories.CategoriaNegocioRepository;

@Service
public class CategoriaNegocioServiceImpl implements CategoriaNegocioService {

    private final CategoriaNegocioRepository repository;

    public CategoriaNegocioServiceImpl(CategoriaNegocioRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CategoriaNegocio> findAll() {
        return (List<CategoriaNegocio>) repository.findAll();
    }
}
