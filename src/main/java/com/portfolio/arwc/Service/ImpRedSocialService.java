
package com.portfolio.arwc.Service;

import com.portfolio.arwc.Entity.RedSocial;
import com.portfolio.arwc.Interface.IRedSocialService;
import com.portfolio.arwc.Repository.IRedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpRedSocialService implements IRedSocialService{
    @Autowired IRedSocialRepository iRedSocialRepository;

    @Override
    public List<RedSocial> getRedSocial() {
        List<RedSocial> redSocial = iRedSocialRepository.findAll();
        return redSocial;
    }

    @Override
    public void saveRedSocial(RedSocial redSocial) {
        iRedSocialRepository.save(redSocial);
    }

    @Override
    public void deleteRedSocial(Long id) {
        iRedSocialRepository.deleteById(id);
    }

    @Override
    public RedSocial findRedSocial(Long id) {
        RedSocial redSocial = iRedSocialRepository.findById(id).orElse(null);
        return redSocial;
    }
    
}
