package com.portfolio.arwc.Interface;

import com.portfolio.arwc.Entity.Skill;
import java.util.List;

public interface ISkillService {
    //Traer una lista Skills
    public List<Skill> getSkill();
    
    public List<Skill> getSkillsByPersonaID(Long id);
    
    //Guardar un objeto de tipo logo
    public void saveSkill(Skill skill);
    
    //Eliminar objeto por ID
    public void deleteSkill(Long id);
    
    //Buscar logo por ID
    public Skill findSkill(Long id);
    

}
