package com.tienda.oferton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.oferton.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {}
