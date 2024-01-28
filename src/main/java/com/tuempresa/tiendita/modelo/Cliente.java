package com.tuempresa.tiendita.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity  
@Getter @Setter 
public class Cliente {
 
	@Id  
    @Column(length=6) 
    int numero;

    @Column(length=50)
    @Required
    private String nombre;

    @Column(length=100)
    @Required
    private String direccion;

    @Column(length=10)
    @Required
    private String telefono;
}
