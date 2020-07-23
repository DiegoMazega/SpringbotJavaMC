package com.diegomazega.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias") //nome do endpoint
public class CategoriaResources {
	
	@GetMapping
	public String listar() {
		return "Rest ok";
	}

}
