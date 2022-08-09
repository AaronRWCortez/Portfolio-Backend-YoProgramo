/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.arwc.Controller;

import com.portfolio.arwc.Entity.Usuario;
import com.portfolio.arwc.Interface.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aaron
 */
@RestController
@CrossOrigin (origins = "https://aaron-cortez.web.app")
public class UsuarioController {
        @Autowired IUsuarioService iUsuarioService;
    
    @GetMapping("/usuarios/traer")
    public List<Usuario> getUsuario(){
        return iUsuarioService.getUsuario();
    }
    
    @GetMapping("/usuarios/traer/{id}")
    public Usuario getUsuarioID(@PathVariable Long id){
        return iUsuarioService.findUsuario(id);   
    }
    
    @PostMapping("/usuarios/login")
    public Boolean getUsuarioByUser(@RequestBody Usuario usuario){
        Usuario regUser =  iUsuarioService.findUsuarioByUsername(usuario.getUsername());
            return regUser.getPassword().equals(usuario.getPassword());
    }
    

    @PostMapping("/usuarios/crear")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        iUsuarioService.saveUsuario(usuario);
        return usuario;
    }
    

    @DeleteMapping("/usuarios/borrar/{id}")
    public Long deleteUsuario(@PathVariable Long id){
        iUsuarioService.deleteUsuario(id);
        return id;
    }
    

    @PutMapping("/usuarios/editar/{id}")
    public Usuario editUsuario(
            @PathVariable Long id, @RequestBody Usuario p){
        Usuario usuario = iUsuarioService.findUsuario(id);
        usuario.setUsername(p.getUsername());
        usuario.setPassword(p.getPassword());
        
        
        iUsuarioService.saveUsuario(usuario);
        return usuario;
    }
}
