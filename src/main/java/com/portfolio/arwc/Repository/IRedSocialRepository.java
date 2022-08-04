package com.portfolio.arwc.Repository;

import com.portfolio.arwc.Entity.RedSocial;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRedSocialRepository extends JpaRepository<RedSocial,Long>{
        List<RedSocial> findAllByPersona_Id(Long id);
}