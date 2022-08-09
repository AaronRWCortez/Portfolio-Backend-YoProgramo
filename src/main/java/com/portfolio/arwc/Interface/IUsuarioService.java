/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.arwc.Interface;

import com.portfolio.arwc.Entity.Usuario;
import java.util.List;

/**
 *
 * @author Aaron
 */
public interface IUsuarioService {

    //Traer una lista Usuarios
    public List<Usuario> getUsuario();
    
    public Usuario findUsuarioByUsername(String username);
    
    //Guardar un objeto de tipo logo
    public void saveUsuario(Usuario usuario);
    
    //Eliminar objeto por ID
    public void deleteUsuario(Long id);
    
    //Buscar logo por ID
    public Usuario findUsuario(Long id);
    

}
