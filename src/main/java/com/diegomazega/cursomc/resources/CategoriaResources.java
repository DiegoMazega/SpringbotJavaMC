package com.diegomazega.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegomazega.cursomc.domain.Categoria;
import com.diegomazega.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias") //nome do endpoint
public class CategoriaResources {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listarTodos(){
		List<Categoria> catList = service.findAll();
		return ResponseEntity.ok(catList);
	}
	
	@GetMapping(value="/{id}") //Variavel que vem da url. 
	public ResponseEntity<?> listarPorId(@PathVariable Integer id) {
		Categoria categoria = service.find(id);
		return ResponseEntity.ok(categoria);
	}

}
