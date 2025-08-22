package com.unir.digiturno.business.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "SERVICIOS")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICIO")
    private Long id;

    @Column(name = "NEGOCIO_ID")
    private Long negocioId;

    @Column(name = "NOMBRE_SERVICIO")
    private String nombre;

    @Column(name = "DURACION_MIN")
    private Integer duracionMin;

    @Column(name = "PRECIO")
    private Integer precio;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getNegocioId() { return negocioId; }
    public void setNegocioId(Long negocioId) { this.negocioId = negocioId; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Integer getDuracionMin() { return duracionMin; }
    public void setDuracionMin(Integer duracionMin) { this.duracionMin = duracionMin; }
    public Integer getPrecio() { return precio; }
    public void setPrecio(Integer precio) { this.precio = precio; }
}
