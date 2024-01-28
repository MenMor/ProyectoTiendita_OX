package com.tuempresa.tiendita.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity  
@Getter @Setter 
public class Inventario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInventario;

	@ElementCollection
	@ListProperties("producto.numero, producto.descripcion, cantidad")
	Collection<Detalle> detalles; 

}
