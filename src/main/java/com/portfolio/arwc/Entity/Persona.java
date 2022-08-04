
package com.portfolio.arwc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String titulo;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String localidad;
    
    @NotNull
    @Size(min = 1, max = 500, message = "no cumple con la longitud")
    private String descripcion;
    
    @NotNull
    @Size(min = 1)
    private String img;
    
    @NotNull
    @Size(min = 1)
    private String banner;
    


    
    
}
