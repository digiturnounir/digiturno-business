package com.unir.digiturno.business.dto;

public class NegocioListDTO {
    private Long idNegocio;
    private String nombre;
    private String descripcion;
    private String urlImagen;
    private String direccion;
    private String categoria; // Nombre de la categoría
    private Long idCategoria;
    private String horaInicio;
    private String horaFin;
    private Integer duracionCita;
    private Double rating; // Promedio de calificaciones

    // Constructores
    public NegocioListDTO() {}

    public NegocioListDTO(Long idNegocio, String nombre, String descripcion, String urlImagen, 
                         String direccion, String categoria, Long idCategoria, String horaInicio, 
                         String horaFin, Integer duracionCita, Double rating) {
        this.idNegocio = idNegocio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.direccion = direccion;
        this.categoria = categoria;
        this.idCategoria = idCategoria;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.duracionCita = duracionCita;
        this.rating = rating;
    }

    // Getters y Setters
    public Long getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(Long idNegocio) {
        this.idNegocio = idNegocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
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

    public Integer getDuracionCita() {
        return duracionCita;
    }

    public void setDuracionCita(Integer duracionCita) {
        this.duracionCita = duracionCita;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
