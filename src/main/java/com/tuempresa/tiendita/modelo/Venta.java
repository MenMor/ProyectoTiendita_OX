package com.tuempresa.tiendita.modelo;

import java.math.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity  
@Getter @Setter 
public class Venta {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;

    

    @ManyToOne( 
		    fetch=FetchType.LAZY, 
		    optional=true) 
		    @DescriptionsList 
		    Cliente cliente;

	@ElementCollection
	@ListProperties("producto.numero, producto.descripcion, cantidad")
	Collection<Detalle> detalles;

	
	@ReadOnly
    @Money
    @Calculation("sum(detalles.cantidad) + producto.precio")    
    BigDecimal totalVenta; 

}
