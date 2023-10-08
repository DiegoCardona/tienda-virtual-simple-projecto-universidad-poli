package com.tienda.oferton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.oferton.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}

