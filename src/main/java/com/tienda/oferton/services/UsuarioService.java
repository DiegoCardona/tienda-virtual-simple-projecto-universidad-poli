package com.tienda.oferton.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.oferton.entities.Usuario;
import com.tienda.oferton.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Save a new user or update an existing one
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Get all users
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    // Get a user by ID
    public Optional<Usuario> getById(Long id) {
        return usuarioRepository.findById(id);
    }
}
