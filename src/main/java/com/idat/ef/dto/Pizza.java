package com.idat.ef.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pizza {
	
	private Integer idPizza;
	private String nombrePizza;
	private String descripcion;

}
