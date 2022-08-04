package com.portfolio.arwc.Repository;

import com.portfolio.arwc.Entity.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto,Long>{
    
        List<Proyecto> findAllByPersona_Id(Long id);
}