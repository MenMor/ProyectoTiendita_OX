package com.tuempresa.tiendita.modelo;

import javax.persistence.*;

import lombok.*;
 
@Entity  
@Getter @Setter 
public class HistorialCliente {

	@Id 
    @Column(length=6) 
    int IdHistorial;
 
	
	 
}
