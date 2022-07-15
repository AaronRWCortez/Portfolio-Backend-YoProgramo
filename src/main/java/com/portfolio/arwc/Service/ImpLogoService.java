
package com.portfolio.arwc.Service;

import com.portfolio.arwc.Entity.Logo;
import com.portfolio.arwc.Interface.ILogoService;
import com.portfolio.arwc.Repository.ILogoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpLogoService implements ILogoService{
    @Autowired ILogoRepository iLogoRepository;

    @Override
    public List<Logo> getLogo() {
        List<Logo> logo = iLogoRepository.findAll();
        return logo;
    }

    @Override
    public void saveLogo(Logo logo) {
        iLogoRepository.save(logo);
    }

    @Override
    public void deleteLogo(Long id) {
        iLogoRepository.deleteById(id);
    }

    @Override
    public Logo findLogo(Long id) {
        Logo logo = iLogoRepository.findById(id).orElse(null);
        return logo;
    }
    
}
