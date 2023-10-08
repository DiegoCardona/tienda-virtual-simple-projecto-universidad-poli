package com.tienda.oferton.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.oferton.entities.Pedido;
import com.tienda.oferton.repositories.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido save(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Optional<Pedido> getById(Long id) {
        return pedidoRepository.findById(id);
    }

    public List<Pedido> getAll() {
        return pedidoRepository.findAll();
    }
}

