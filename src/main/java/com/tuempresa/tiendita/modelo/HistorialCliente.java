package com.tuempresa.tiendita.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity  
@Getter @Setter 
public class HistorialCliente {

	@Id 
    @Column(length=6) 
    int IdHistorial;
 
	@ElementCollection
	@ListProperties("cedula, nombre")
	Collection<Cliente> cliente; 
	
	 
}
