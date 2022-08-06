package com.portfolio.arwc.Controller;

import com.portfolio.arwc.Entity.Persona;
import com.portfolio.arwc.Interface.IPersonaService;
import java.util.List;
import javax.annotation.security.RolesAllowed;
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
public class PersonaController {
    @Autowired IPersonaService iPersonaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return iPersonaService.getPersona();
    }
    
    @GetMapping("/personas/traer/{id}")
    public Persona getPersonaID(@PathVariable Long id){
        return iPersonaService.findPersona(id);   
    }

    @RolesAllowed({"ROLE_ADMIN"})
    @PostMapping("/personas/crear")
    public Persona createPersona(@RequestBody Persona persona){
        iPersonaService.savePersona(persona);
        return persona;
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @DeleteMapping("/personas/borrar/{id}")
    public Long deletePersona(@PathVariable Long id){
        iPersonaService.deletePersona(id);
        return id;
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(
            @PathVariable Long id, @RequestBody Persona p){
        Persona persona = iPersonaService.findPersona(id);
        persona.setNombre(p.getNombre());
        persona.setApellido(p.getApellido());
        persona.setTitulo(p.getTitulo());
        persona.setLocalidad(p.getLocalidad());
        persona.setDescripcion(p.getDescripcion());
        persona.setImg(p.getImg());
        persona.setBanner(p.getBanner());
        
        
        iPersonaService.savePersona(persona);
        return persona;
    }
}
