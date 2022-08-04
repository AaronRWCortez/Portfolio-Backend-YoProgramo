package com.portfolio.arwc.Repository;

import com.portfolio.arwc.Entity.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion,Long>{
    List<Educacion> findAllByPersona_Id(Long id);
}
