package com.portfolio.arwc.Interface;

import com.portfolio.arwc.Entity.Experiencia;
import java.util.List;

public interface IExperienciaService {
    //Traer una lista Experiencias
    public List<Experiencia> getExperiencia();
    
    public List<Experiencia> getExperienciaByPersonaID(Long id);
    
    //Guardar un objeto
    public void saveExperiencia(Experiencia experiencia);
    
    //Eliminar objeto por ID
    public void deleteExperiencia(Long id);
    
    //Buscar persona por ID
    public Experiencia findExperiencia(Long id);
}
