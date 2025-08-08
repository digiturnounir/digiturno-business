package com.unir.digiturno.business.models.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "calificaciones")
public class Calificacion {

    @Id
    @Column(name = "id_calificacion")
    private Long idCalificacion;

    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "negocio_id")
    private Long negocioId;

    @Column(name = "puntaje")
    private Integer puntaje;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    // Constructores
    public Calificacion() {}

    // Getters y Setters
    public Long getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Long idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getNegocioId() {
        return negocioId;
    }

    public void setNegocioId(Long negocioId) {
        this.negocioId = negocioId;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
