
package com.portfolio.arwc.Service;

import com.portfolio.arwc.Entity.InfoContacto;
import com.portfolio.arwc.Interface.IInfoContactoService;
import com.portfolio.arwc.Repository.IInfoContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpInfoContactoService implements IInfoContactoService{
    @Autowired IInfoContactoRepository iInfoContactoRepository;

    @Override
    public List<InfoContacto> getInfoContacto() {
        List<InfoContacto> infoContacto = iInfoContactoRepository.findAll();
        return infoContacto;
    }

    @Override
    public void saveInfoContacto(InfoContacto infoContacto) {
        iInfoContactoRepository.save(infoContacto);
    }

    @Override
    public void deleteInfoContacto(Long id) {
        iInfoContactoRepository.deleteById(id);
    }

    @Override
    public InfoContacto findInfoContacto(Long id) {
        InfoContacto infoContacto = iInfoContactoRepository.findById(id).orElse(null);
        return infoContacto;
    }
    
    @Override
    public List<InfoContacto> getInfoContactoByPersonaID(Long id){
    List<InfoContacto> lista = iInfoContactoRepository.findAllByPersona_Id(id);
    return lista;
    }
}