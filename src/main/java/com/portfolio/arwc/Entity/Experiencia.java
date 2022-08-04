
package com.portfolio.arwc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String lugar;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String puesto;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String startDate;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String endDate;
    

    @Size(max = 255, message = "no cumple con la longitud")
    private String descripcion;
    
    @NotNull
    private Boolean imgBool;
    
    @NotNull
    @Size(min = 1)
    private String img;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;
}
