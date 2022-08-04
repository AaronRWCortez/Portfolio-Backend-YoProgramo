
package com.portfolio.arwc.Service;

import com.portfolio.arwc.Entity.Proyecto;
import com.portfolio.arwc.Interface.IProyectoService;
import com.portfolio.arwc.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectoService implements IProyectoService{
    @Autowired IProyectoRepository iProyectoRepository;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto = iProyectoRepository.findAll();
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        iProyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        iProyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto = iProyectoRepository.findById(id).orElse(null);
        return proyecto;
    }

    @Override
    public List<Proyecto> getProyectoByPersonaID(Long id) {
            List<Proyecto> lista = iProyectoRepository.findAllByPersona_Id(id);
    return lista;
    }
    
}
