package com.portfolio.arwc.Controller;

import com.portfolio.arwc.Entity.Skill;
import com.portfolio.arwc.Interface.ISkillService;
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
@CrossOrigin
public class SkillController {
    @Autowired ISkillService iSkillService;
    
    @GetMapping("/skills/traer")
    public List<Skill> getSkill(){
        return iSkillService.getSkill();
    }
    
    @GetMapping("/skills/traer/{id}")
    public Skill getSkillID(@PathVariable Long id){
        return iSkillService.findSkill(id);   
    }
    
    @GetMapping("/skills/traer/persona/{id}")
    public  List<Skill> getSkillByUser(@PathVariable Long id){
        return iSkillService.getSkillsByPersonaID(id);   
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @PostMapping("/skills/crear")
    public Skill createSkill(@RequestBody Skill skill){
        iSkillService.saveSkill(skill);
        return skill;
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @DeleteMapping("/skills/borrar/{id}")
    public Long deleteSkill(@PathVariable Long id){
        iSkillService.deleteSkill(id);
        return id;
    }
    
    @RolesAllowed({"ROLE_ADMIN"})
    @PutMapping("/skills/editar/{id}")
    public Skill editSkill(
            @PathVariable Long id, @RequestBody Skill p){
        Skill skill = iSkillService.findSkill(id);
        skill.setTitulo(p.getTitulo());
        skill.setPercent(p.getPercent());
        skill.setColor(p.getColor());
        skill.setColorgr(p.getColorgr());
        skill.setImg(p.getImg());
        skill.setPersona(p.getPersona());
        
        
        iSkillService.saveSkill(skill);
        return skill;
    }
}