package com.idat.ef.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizzeria_pizza")
public class Detalle {
	
	@Id
	private PizzeriaPizzaFK fk =new PizzeriaPizzaFK();

	public PizzeriaPizzaFK getFk() {
		return fk;
	}

	public void setFk(PizzeriaPizzaFK fk) {
		this.fk = fk;
	}

}
