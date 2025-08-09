package com.unir.digiturno.business.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.unir.digiturno.business.dto.NegocioListDTO;
import com.unir.digiturno.business.models.entities.Negocio;

public interface NegocioRepository extends CrudRepository<Negocio, Long>{
    List<Negocio> findByIdUsuario(Long idUsuario);
    
    @Query("SELECT new com.unir.digiturno.business.dto.NegocioListDTO(" +
           "n.idNegocio, n.nombre, n.descripcion, n.urlImagen, n.direccion, " +
           "c.nombre, n.idCategoria, n.horaInicio, n.horaFin, n.duracionCita, " +
           "COALESCE(AVG(cal.puntaje), 0.0)) " +
           "FROM Negocio n " +
           "LEFT JOIN CategoriaNegocio c ON n.idCategoria = c.idCategoria " +
           "LEFT JOIN Calificacion cal ON n.idNegocio = cal.negocioId " +
           "GROUP BY n.idNegocio, n.nombre, n.descripcion, n.urlImagen, n.direccion, " +
           "c.nombre, n.idCategoria, n.horaInicio, n.horaFin, n.duracionCita")
    List<NegocioListDTO> findAllWithCategoryAndRating();
}

