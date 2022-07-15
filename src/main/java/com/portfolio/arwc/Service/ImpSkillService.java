
package com.portfolio.arwc.Service;

import com.portfolio.arwc.Entity.Skill;
import com.portfolio.arwc.Interface.ISkillService;
import com.portfolio.arwc.Repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSkillService implements ISkillService{
    @Autowired ISkillRepository iSkillRepository;

    @Override
    public List<Skill> getSkill() {
        List<Skill> skill = iSkillRepository.findAll();
        return skill;
    }

    @Override
    public void saveSkill(Skill skill) {
        iSkillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        iSkillRepository.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = iSkillRepository.findById(id).orElse(null);
        return skill;
    }
    
}
