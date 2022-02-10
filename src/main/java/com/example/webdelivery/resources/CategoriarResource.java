package com.example.webdelivery.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdelivery.domain.Categoria;
import com.example.webdelivery.service.CategoriaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "categorias")
@RequestMapping(value="/categorias")
public class CategoriarResource {
	
	@Autowired
	private CategoriaService service;
	
	
	@ApiOperation(value = "Obter todas as Categorias")
	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public ResponseEntity<Categoria> listar(@PathVariable Integer id ) 
	{	
		var categoria = service.Obter(id);
		
		return ResponseEntity.ok(categoria);
	}
	
}
