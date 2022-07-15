package com.portfolio.arwc.Interface;

import com.portfolio.arwc.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista Personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar objeto por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
}
