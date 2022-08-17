	package com.idat.ef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.ef.model.Pizzeria;
import com.idat.ef.service.PizzeriaService;

@RestController
@RequestMapping("/api/pizzeria/ef")	
public class PizzeriaController {
	
	@Autowired
	private PizzeriaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizzeria> listar(){
		return service.listar();
	}

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Pizzeria pizzeria) {
		service.guardar(pizzeria);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Pizzeria pizzeria) {
		service.actualizar(pizzeria);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarPizzasAPizzerias() {
		service.asignarPizzeriaPizza();
	}

}
