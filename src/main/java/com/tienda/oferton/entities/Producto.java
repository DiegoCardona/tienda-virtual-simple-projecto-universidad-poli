package com.tienda.oferton.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String imagen;
    private Double precio;
    
    public Producto(Long productoId, String nombre, String imagen, Double precio) {
        this.id = productoId;
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
    }

    public Producto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long productoId) {
        this.id = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
