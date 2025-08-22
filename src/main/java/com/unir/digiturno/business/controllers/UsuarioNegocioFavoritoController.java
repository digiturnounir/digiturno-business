package com.unir.digiturno.business.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.unir.digiturno.business.models.entities.UsuarioNegocioFavorito;
import com.unir.digiturno.business.response.ApiResponse;
import com.unir.digiturno.business.services.UsuarioNegocioFavoritoService;

@RestController
@RequestMapping("/favoritos")
public class UsuarioNegocioFavoritoController {


    @Autowired
    private UsuarioNegocioFavoritoService service;

    @Autowired
    private com.unir.digiturno.business.services.NegocioService negocioService;

    @GetMapping("/{usuarioId}")
    public ResponseEntity<ApiResponse<List<com.unir.digiturno.business.dto.NegocioListDTO>>> getFavoritos(@PathVariable Long usuarioId) {
        List<UsuarioNegocioFavorito> favoritos = service.findByUsuarioId(usuarioId);
        List<com.unir.digiturno.business.dto.NegocioListDTO> negociosFavoritos = favoritos.stream()
            .map(fav -> negocioService.findById(fav.getNegocioId())
                .map(negocio -> {
                    // Si tienes un método para convertir Negocio a NegocioListDTO, úsalo aquí
                    // Aquí se asume que NegocioListDTO tiene un constructor que acepta Negocio
                    return new com.unir.digiturno.business.dto.NegocioListDTO(
                        negocio.getIdNegocio(),
                        negocio.getNombre(),
                        negocio.getDescripcion(),
                        negocio.getUrlImagen(),
                        negocio.getDireccion(),
                        null, // categoria, si necesitas puedes obtenerla con negocio.getIdCategoria()
                        negocio.getIdCategoria(),
                        negocio.getHoraInicio(),
                        negocio.getHoraFin(),
                        negocio.getDuracionCita(),
                        null // rating, si tienes lógica para calcularlo
                    );
                })
                .orElse(null)
            )
            .filter(dto -> dto != null)
            .toList();
        return ResponseEntity.ok(new ApiResponse<>(true, "Favoritos del usuario", 2000, negociosFavoritos));
    }

    @PostMapping("/{usuarioId}/{negocioId}")
    public ResponseEntity<ApiResponse<UsuarioNegocioFavorito>> addFavorito(@PathVariable Long usuarioId, @PathVariable Long negocioId) {
        Optional<UsuarioNegocioFavorito> favorito = service.addFavorito(usuarioId, negocioId);
        if (favorito.isPresent()) {
            return ResponseEntity.ok(new ApiResponse<>(true, "Negocio marcado como favorito", 2000, favorito.get()));
        } else {
            return ResponseEntity.ok(new ApiResponse<>(false, "Ya existe como favorito", 4000, null));
        }
    }

    @DeleteMapping("/{usuarioId}/{negocioId}")
    public ResponseEntity<ApiResponse<Void>> removeFavorito(@PathVariable Long usuarioId, @PathVariable Long negocioId) {
        service.removeFavorito(usuarioId, negocioId);
        return ResponseEntity.ok(new ApiResponse<>(true, "Negocio eliminado de favoritos", 2000, null));
    }

    @GetMapping("/isFavorito/{usuarioId}/{negocioId}")
    public ResponseEntity<ApiResponse<Boolean>> isFavorito(@PathVariable Long usuarioId, @PathVariable Long negocioId) {
        boolean favorito = service.isFavorito(usuarioId, negocioId);
        return ResponseEntity.ok(new ApiResponse<>(true, "¿Es favorito?", 2000, favorito));
    }
}
