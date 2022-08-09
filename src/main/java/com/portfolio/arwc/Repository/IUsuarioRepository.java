/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.arwc.Repository;

import com.portfolio.arwc.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aaron
 */
    public interface IUsuarioRepository extends JpaRepository<Usuario,Long>{
    
    Usuario findByUsername(String username);
}
