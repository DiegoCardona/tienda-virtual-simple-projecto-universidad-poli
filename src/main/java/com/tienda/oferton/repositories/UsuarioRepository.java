package com.tienda.oferton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.oferton.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
