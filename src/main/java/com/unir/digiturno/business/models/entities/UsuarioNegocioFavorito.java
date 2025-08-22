
package com.unir.digiturno.business.models.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "usuario_negocio_favorito")
public class UsuarioNegocioFavorito {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario_negocio_favorito")
    @SequenceGenerator(name = "seq_usuario_negocio_favorito", sequenceName = "SEQ_USUARIO_NEGOCIO_FAVORITO", allocationSize = 1)
    @Column(name = "id_favorito")
    private Long idFavorito;

    @Column(name = "usuario_id", nullable = false)
    private Long usuarioId;

    @Column(name = "negocio_id", nullable = false)
    private Long negocioId;

    @Column(name = "fecha_agregado")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime fechaAgregado;

    // Constructor vacío
    public UsuarioNegocioFavorito() {}

    // Getters y Setters
    public Long getIdFavorito() {
        return idFavorito;
    }

    public void setIdFavorito(Long idFavorito) {
        this.idFavorito = idFavorito;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getNegocioId() {
        return negocioId;
    }

    public void setNegocioId(Long negocioId) {
        this.negocioId = negocioId;
    }

    public LocalDateTime getFechaAgregado() {
        return fechaAgregado;
    }

    public void setFechaAgregado(LocalDateTime fechaAgregado) {
        this.fechaAgregado = fechaAgregado;
    }
}
