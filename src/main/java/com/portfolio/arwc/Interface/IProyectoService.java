package com.portfolio.arwc.Interface;

import com.portfolio.arwc.Entity.Proyecto;
import java.util.List;

public interface IProyectoService {
    //Traer una lista Proyectos
    public List<Proyecto> getProyecto();
    
    public List<Proyecto> getProyectoByPersonaID(Long id);
    
    //Guardar un objeto de tipo logo
    public void saveProyecto(Proyecto proyecto);
    
    //Eliminar objeto por ID
    public void deleteProyecto(Long id);
    
    //Buscar logo por ID
    public Proyecto findProyecto(Long id);
}
