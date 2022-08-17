package com.idat.ef.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.ef.client.OpenFeignClient;
import com.idat.ef.entity.Detalle;
import com.idat.ef.entity.PizzeriaPizzaFK;
import com.idat.ef.model.Pizzeria;
import com.idat.ef.dto.Pizza;
import com.idat.ef.repository.PizzeriaPizza;
import com.idat.ef.repository.PizzeriaRepository;

public class PizzeriaServiceImpl implements PizzeriaService {

	@Autowired
	private PizzeriaRepository repository;
	
	@Autowired
	private PizzeriaPizza repopizza;
	
	@Autowired
	private OpenFeignClient feign;
	
	
	
	@Override
	public List<Pizzeria> listar() {
		return repository.findAll();
	}

	@Override
	public Pizzeria obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizzeria pizzeria) {
		repository.save(pizzeria);

	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Pizzeria pizzeria) {
		repository.saveAndFlush(pizzeria);

	}

	@Override
	public void asignarPizzeriaPizza() {
		List<Pizza> listado = feign.listarPizzasSeleccionados();;
		PizzeriaPizzaFK fk = null;
		Detalle deta = null;

		
		for (Pizza pizza : listado) {
			
			fk = new PizzeriaPizzaFK();
			fk.setIdPizza(pizza.getIdPizza());
			fk.setIdPizzeria(1);
			
			deta = new Detalle();
			deta.setFk(fk);	
			
			repopizza.save(repopizza);
		}

	}

}
