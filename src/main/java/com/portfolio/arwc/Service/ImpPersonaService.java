
package com.portfolio.arwc.Service;

import com.portfolio.arwc.Entity.Persona;
import com.portfolio.arwc.Interface.IPersonaService;
import com.portfolio.arwc.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository iPersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = iPersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        iPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        iPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = iPersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
