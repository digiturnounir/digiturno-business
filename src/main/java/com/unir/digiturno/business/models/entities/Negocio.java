package com.unir.digiturno.business.models.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "negocios")
public class Negocio {

    @Id
    @Generated()
    @Column(name = "id_negocio", updatable = false, insertable = false)
    private Long idNegocio;

    @Column(name = "usuario_id", nullable = false)
    private Long idUsuario;

    @Column(name = "id_categoria", nullable = false)
    private Long idCategoria;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "url_imagen")
    private String urlImagen;

    @Column(name = "duracion_cita")
    private Integer duracionCita;

    @Column(name = "hora_inicio")
    private String horaInicio;

    @Column(name = "hora_fin")
    private String horaFin;

    @Column(name = "creado_en")
    private LocalDateTime fechcrea;

    // Getters y Setters

    public Long getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(Long idNegocio) {
        this.idNegocio = idNegocio;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Integer getDuracionCita() {
        return duracionCita;
    }

    public void setDuracionCita(Integer duracionCita) {
        this.duracionCita = duracionCita;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public LocalDateTime getFechcrea() {
        return fechcrea;
    }

    public void setFechcrea(LocalDateTime fechcrea) {
        this.fechcrea = fechcrea;
    }
}
