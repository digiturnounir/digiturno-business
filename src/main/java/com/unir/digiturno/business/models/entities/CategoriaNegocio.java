package com.unir.digiturno.business.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias_negocio")
public class CategoriaNegocio {

    @Id
    @Column(name = "id_categoria")
    private Long idCategoria;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    // Constructores
    public CategoriaNegocio() {}

    public CategoriaNegocio(Long idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

    // Getters y Setters
    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
