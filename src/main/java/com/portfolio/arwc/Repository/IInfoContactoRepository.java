package com.portfolio.arwc.Repository;

import com.portfolio.arwc.Entity.InfoContacto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInfoContactoRepository extends JpaRepository<InfoContacto,Long>{
    List<InfoContacto> findAllByPersona_Id(Long id);
}
