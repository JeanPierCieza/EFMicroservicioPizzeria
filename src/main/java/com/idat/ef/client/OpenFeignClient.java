package com.idat.ef.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.ef.dto.Pizza;


@FeignClient(name="ef-pizza", url="localhost:3000")
public interface OpenFeignClient {
	
	@GetMapping("/api/pizza/ef/listar")
	public List<Pizza> listarPizzasSeleccionados();

}
