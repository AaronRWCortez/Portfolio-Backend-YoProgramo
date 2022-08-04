package com.portfolio.arwc.Interface;

import com.portfolio.arwc.Entity.RedSocial;
import java.util.List;

public interface IRedSocialService {
    //Traer una lista RedSocials
    public List<RedSocial> getRedSocial();
    
    //Guardar un objeto de tipo logo
    public void saveRedSocial(RedSocial redSocial);
    
    public List<RedSocial> getRedSocialByPersonaID(Long id);
    
    //Eliminar objeto por ID
    public void deleteRedSocial(Long id);
    
    //Buscar logo por ID
    public RedSocial findRedSocial(Long id);
}
