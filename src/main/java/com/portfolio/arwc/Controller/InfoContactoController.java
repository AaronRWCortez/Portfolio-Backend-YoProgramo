/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.arwc.Controller;

import com.portfolio.arwc.Entity.InfoContacto;
import com.portfolio.arwc.Interface.IInfoContactoService;
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

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class InfoContactoController {
        @Autowired IInfoContactoService iInfoContactoService;
    
    @GetMapping("/infoContacto/traer")
    public List<InfoContacto> getInfoContacto(){
        return iInfoContactoService.getInfoContacto();
    }
    
    @GetMapping("/infoContacto/traer/{id}")
    public InfoContacto getInfoContactoID(@PathVariable Long id){
        return iInfoContactoService.findInfoContacto(id);   
    }
    
    @GetMapping("/infoContacto/traer/persona/{id}")
    public  List<InfoContacto> getInfoContactoByUser(@PathVariable Long id){
        return iInfoContactoService.getInfoContactoByPersonaID(id);   
    }
    

    @PostMapping("/infoContacto/crear")
    public InfoContacto createInfoContacto(@RequestBody InfoContacto infoContacto){
        iInfoContactoService.saveInfoContacto(infoContacto);
        return infoContacto;
    }
    

    @DeleteMapping("/infoContacto/borrar/{id}")
    public Long deleteInfoContacto(@PathVariable Long id){
        iInfoContactoService.deleteInfoContacto(id);
        return id;
    }
    

    @PutMapping("/infoContacto/editar/{id}")
    public InfoContacto editInfoContacto(
            @PathVariable Long id, @RequestBody InfoContacto p){
        InfoContacto infoContacto = iInfoContactoService.findInfoContacto(id);
        infoContacto.setNombre(p.getNombre());
        infoContacto.setValor(p.getValor());
        infoContacto.setVisibilidad(p.getVisibilidad());
        infoContacto.setPersona(p.getPersona());

        
        
        iInfoContactoService.saveInfoContacto(infoContacto);
        return infoContacto;
    }
}
