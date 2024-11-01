package com.example.JavaWithMongoDB.service;

import com.example.JavaWithMongoDB.document.Usuario;
import com.example.JavaWithMongoDB.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuario(){
        return usuarioRepository.findAll();
    }
    public Usuario createUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void deleteUsuario(String id){
        usuarioRepository.deleteById(id);
    }
}
