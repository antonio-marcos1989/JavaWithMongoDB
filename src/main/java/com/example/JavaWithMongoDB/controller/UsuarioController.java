package com.example.JavaWithMongoDB.controller;

import com.example.JavaWithMongoDB.document.Usuario;
import com.example.JavaWithMongoDB.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    public List<Usuario> getAllUsuario(){
        return usuarioService.getAllUsuario();
    }
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }
    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable String id){
        usuarioService.deleteUsuario(id);
    }


}
