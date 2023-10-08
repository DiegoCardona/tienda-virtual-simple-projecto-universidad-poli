package com.tienda.oferton.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.ArrayList;

@Entity
@Table(name = "pedido")
public class Pedido {

    @OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<DetallePedido> detalles = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario_id", nullable = false)
    private Long usuarioId;

    @Column(name = "total", nullable = false)
    private BigDecimal total;

    @Column(name = "metodoPago", nullable = false, length = 50)
    private String metodoPago;

    @Column(name = "direccion", nullable = false, length = 255)
    private String direccion;

    @Column(name = "indicaciones")
    private String indicaciones;

    @Column(name = "nombreReceptor", nullable = false, length = 255)
    private String nombreReceptor;

    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;

    public Pedido(Long id, Long usuarioId, BigDecimal total, String metodoPago, String direccion, String indicaciones,
            String nombreReceptor, String telefono, List<DetallePedido> detalles) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.total = total;
        this.metodoPago = metodoPago;
        this.direccion = direccion;
        this.indicaciones = indicaciones;
        this.nombreReceptor = nombreReceptor;
        this.telefono = telefono;
        this.detalles = detalles;
    }

    public Pedido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }
}
