package com.portfolio.arwc.Interface;

import com.portfolio.arwc.Entity.Logo;
import java.util.List;

public interface ILogoService {
    //Traer una lista Logos
    public List<Logo> getLogo();
    
    //Guardar un objeto de tipo logo
    public void saveLogo(Logo logo);
    
    //Eliminar objeto por ID
    public void deleteLogo(Long id);
    
    //Buscar logo por ID
    public Logo findLogo(Long id);
}
