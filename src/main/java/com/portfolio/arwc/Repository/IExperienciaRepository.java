package com.portfolio.arwc.Repository;

import com.portfolio.arwc.Entity.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia,Long>{
    
    List<Experiencia> findAllByPersona_Id(Long id);
}


