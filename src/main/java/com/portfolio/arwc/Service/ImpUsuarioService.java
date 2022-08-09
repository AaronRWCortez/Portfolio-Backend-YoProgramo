/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.arwc.Service;

import com.portfolio.arwc.Entity.Usuario;
import com.portfolio.arwc.Interface.IUsuarioService;
import com.portfolio.arwc.Repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aaron
 */
@Service
public class ImpUsuarioService implements IUsuarioService{
    @Autowired IUsuarioRepository iUsuarioRepository;

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> usuario = iUsuarioRepository.findAll();
        return usuario;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        iUsuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        iUsuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario usuario = iUsuarioRepository.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public Usuario findUsuarioByUsername(String username) {
        Usuario usuario = iUsuarioRepository.findByUsername(username);
        return usuario;
    }
    
    
}
