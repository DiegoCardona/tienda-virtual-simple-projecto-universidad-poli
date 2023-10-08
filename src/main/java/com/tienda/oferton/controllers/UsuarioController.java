package com.tienda.oferton.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.oferton.entities.Usuario;
import com.tienda.oferton.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Endpoint to add a new user
    @PostMapping
    public ResponseEntity<Usuario> addUser(@RequestBody Usuario usuario) {
        try {
            Usuario savedUser = usuarioService.save(usuario);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Endpoint to get a user by ID
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUser(@PathVariable Long id) {
        Optional<Usuario> userData = usuarioService.getById(id);

        return userData.map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                       .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
