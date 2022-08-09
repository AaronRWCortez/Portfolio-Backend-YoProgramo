package com.portfolio.arwc.Controller;

import com.portfolio.arwc.Entity.Experiencia;
import com.portfolio.arwc.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "https://frontend-arwc.web.app")
public class ExperienciaController {

    @Autowired
    IExperienciaService iExperienciaService;

    @GetMapping("/experiencias/traer")
    public List<Experiencia> getExperiencia() {
        return iExperienciaService.getExperiencia();
    }

    @GetMapping("/experiencias/traer/{id}")
    public Experiencia getExperienciaID(@PathVariable Long id) {
        return iExperienciaService.findExperiencia(id);
    }

    @GetMapping("/experiencias/traer/persona/{id}")
    public List<Experiencia> getExperienciaByUser(@PathVariable Long id) {
        return iExperienciaService.getExperienciaByPersonaID(id);
    }


    @PostMapping("/experiencias/crear")
    public Experiencia createExperiencia(@RequestBody Experiencia experiencia) {
        iExperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }


    @DeleteMapping("/experiencias/borrar/{id}")
    public Long deleteExperiencia(@PathVariable Long id) {
        iExperienciaService.deleteExperiencia(id);
        return id;
    }


    @PutMapping("/experiencias/editar/{id}")
    public Experiencia editExperiencia(
            @PathVariable Long id, @RequestBody Experiencia p) {
        Experiencia experiencia = iExperienciaService.findExperiencia(id);
        experiencia.setLugar(p.getLugar());
        experiencia.setPuesto(p.getPuesto());
        experiencia.setStartDate(p.getStartDate());
        experiencia.setEndDate(p.getEndDate());
        experiencia.setDescripcion(p.getDescripcion());
        experiencia.setImg(p.getImg());
        experiencia.setImgBool(p.getImgBool());
        experiencia.setPersona(p.getPersona());

        iExperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }
}
