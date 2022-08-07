package com.portfolio.arwc.Controller;

import com.portfolio.arwc.Entity.Proyecto;
import com.portfolio.arwc.Interface.IProyectoService;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {
    @Autowired IProyectoService iProyectoService;
    
    @GetMapping("/proyectos/traer")
    public List<Proyecto> getProyecto(){
        return iProyectoService.getProyecto();
    }
    
    @GetMapping("/proyectos/traer/{id}")
    public Proyecto getProyectoID(@PathVariable Long id){
        return iProyectoService.findProyecto(id);   
    }
    
    @GetMapping("/proyectos/traer/persona/{id}")
    public  List<Proyecto> getProyectoByUser(@PathVariable Long id){
        return iProyectoService.getProyectoByPersonaID(id);   
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @PostMapping("/proyectos/crear")
    public Proyecto createProyecto(@RequestBody Proyecto proyecto){
        iProyectoService.saveProyecto(proyecto);
        return proyecto;
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @DeleteMapping("/proyectos/borrar/{id}")
    public Long deleteProyecto(@PathVariable Long id){
        iProyectoService.deleteProyecto(id);
        return id;
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @PutMapping("/proyectos/editar/{id}")
    public Proyecto editProyecto(
            @PathVariable Long id, @RequestBody Proyecto p){
        Proyecto proyecto = iProyectoService.findProyecto(id);
        proyecto.setTitulo(p.getTitulo());
        proyecto.setFecha(p.getFecha());
        proyecto.setEnlace(p.getEnlace());
        proyecto.setDescripcion(p.getDescripcion());
        proyecto.setImg(p.getImg());
        proyecto.setPersona(p.getPersona());
        
        
        iProyectoService.saveProyecto(proyecto);
        return proyecto;
    }
}