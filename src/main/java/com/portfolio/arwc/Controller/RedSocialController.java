package com.portfolio.arwc.Controller;

import com.portfolio.arwc.Entity.RedSocial;
import com.portfolio.arwc.Interface.IRedSocialService;
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
public class RedSocialController {
    @Autowired IRedSocialService iRedSocialService;
    
    @GetMapping("/redes-sociales/traer")
    public List<RedSocial> getRedSocial(){
        return iRedSocialService.getRedSocial();
    }
    
    @GetMapping("/redes-sociales/traer/{id}")
    public RedSocial getRedSocialID(@PathVariable Long id){
        return iRedSocialService.findRedSocial(id);   
    }
    
        @GetMapping("/redes-sociales/traer/persona/{id}")
    public  List<RedSocial> getRedSocialByUser(@PathVariable Long id){
        return iRedSocialService.getRedSocialByPersonaID(id);   
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @PostMapping("/redes-sociales/crear")
    public RedSocial createRedSocial(@RequestBody RedSocial redSocial){
        iRedSocialService.saveRedSocial(redSocial);
        return redSocial;
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @DeleteMapping("/redes-sociales/borrar/{id}")
    public Long deleteRedSocial(@PathVariable Long id){
        iRedSocialService.deleteRedSocial(id);
        return id;
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @PutMapping("/redes-sociales/editar/{id}")
    public RedSocial editRedSocial(
            @PathVariable Long id, @RequestBody RedSocial p){
        RedSocial redSocial = iRedSocialService.findRedSocial(id);
        redSocial.setTitulo(p.getTitulo());
        redSocial.setEnlace(p.getEnlace());
        redSocial.setImg(p.getImg());
        redSocial.setPersona(p.getPersona());
        
        
        iRedSocialService.saveRedSocial(redSocial);
        return redSocial;
    }
}