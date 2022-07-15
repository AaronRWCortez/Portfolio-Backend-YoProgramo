package com.portfolio.arwc.Repository;

import com.portfolio.arwc.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill,Long>{
    
}