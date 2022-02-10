package com.example.webdelivery.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdelivery.domain.Categoria;
import com.example.webdelivery.exceptions.ObjectNotFoundException;
import com.example.webdelivery.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria Obter(Integer id) 
	{
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		
		return categoria.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
