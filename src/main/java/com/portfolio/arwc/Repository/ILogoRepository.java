package com.portfolio.arwc.Repository;

import com.portfolio.arwc.Entity.Logo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILogoRepository extends JpaRepository<Logo,Long>{
    
}