package com.portfolio.arwc.Interface;

import com.portfolio.arwc.Entity.Educacion;
import java.util.List;

public interface IEducacionService {
    //Traer una lista Educacions
    public List<Educacion> getEducacion();
    
    //Guardar un objeto
    public void saveEducacion(Educacion educacion);
    
    //Eliminar objeto por ID
    public void deleteEducacion(Long id);
    
    //Buscar Educacion por ID
    public Educacion findEducacion(Long id);
    
}