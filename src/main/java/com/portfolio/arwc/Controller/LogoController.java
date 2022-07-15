package com.portfolio.arwc.Controller;

import com.portfolio.arwc.Entity.Logo;
import com.portfolio.arwc.Interface.ILogoService;
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
public class LogoController {
    @Autowired ILogoService iLogoService;
    
    @GetMapping("/logos/traer")
    public List<Logo> getLogo(){
        return iLogoService.getLogo();
    }
    
    @GetMapping("/logos/traer/{id}")
    public Logo getLogoID(@PathVariable Long id){
        return iLogoService.findLogo(id);   
    }
    
    @PostMapping("/logos/crear")
    public Logo createLogo(@RequestBody Logo logo){
        iLogoService.saveLogo(logo);
        return logo;
    }
    
    @DeleteMapping("/logos/borrar/{id}")
    public Long deleteLogo(@PathVariable Long id){
        iLogoService.deleteLogo(id);
        return id;
    }
    
    @PutMapping("/logos/editar/{id}")
    public Logo editLogo(
            @PathVariable Long id, @RequestBody Logo p){
        Logo logo = iLogoService.findLogo(id);
        logo.setTitulo(p.getTitulo());
        logo.setEnlace(p.getEnlace());
        logo.setImg(p.getImg());
        
        
        iLogoService.saveLogo(logo);
        return logo;
    }
}
