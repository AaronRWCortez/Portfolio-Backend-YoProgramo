/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.arwc.Interface;

import com.portfolio.arwc.Entity.InfoContacto;
import java.util.List;

/**
 *
 * @author Aaron
 */
public interface IInfoContactoService {
            //Traer una lista Educacions
    public List<InfoContacto> getInfoContacto();
    
    //Guardar un objeto
    public void saveInfoContacto(InfoContacto infoContacto);
    
    //Eliminar objeto por ID
    public void deleteInfoContacto(Long id);
    
    //Buscar por ID
    public InfoContacto findInfoContacto(Long id);
}
