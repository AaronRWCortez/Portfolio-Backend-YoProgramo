package com.portfolio.arwc.Repository;

import com.portfolio.arwc.Entity.InfoContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInfoContactoRepository extends JpaRepository<InfoContacto,Long>{
    
}
