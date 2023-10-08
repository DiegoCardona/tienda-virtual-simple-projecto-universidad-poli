package com.tienda.oferton.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.oferton.entities.Producto;
import com.tienda.oferton.repositories.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    public Optional<Producto> getById(Long id) {
        return productoRepository.findById(id);
    }

    public List<Producto> getAll() {
        return productoRepository.findAll();
    }
}
