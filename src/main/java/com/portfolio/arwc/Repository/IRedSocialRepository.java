package com.portfolio.arwc.Repository;

import com.portfolio.arwc.Entity.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRedSocialRepository extends JpaRepository<RedSocial,Long>{
    
}