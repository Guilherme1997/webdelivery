package com.example.webdelivery;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.webdelivery.domain.Categoria;
import com.example.webdelivery.domain.Cidade;
import com.example.webdelivery.domain.Estado;
import com.example.webdelivery.domain.Produto;
import com.example.webdelivery.repositories.CategoriaRepository;
import com.example.webdelivery.repositories.CidadeRepository;
import com.example.webdelivery.repositories.EstadoRepository;
import com.example.webdelivery.repositories.ProdutoRepository;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		criarProdutoCategoria();
		
		criarEstadoCidade();
	}
	
	public void criarProdutoCategoria() {
		
		Categoria primeira_categoria = new Categoria (null,"Informática");
		
		Produto primeiro_produto= new Produto (null,"Computador",20000.00);
		
		primeira_categoria.setProdutos(Arrays.asList(primeiro_produto));
		
		primeiro_produto.setCategorias(Arrays.asList(primeira_categoria));
		
		categoriaRepository.saveAll(Arrays.asList(primeira_categoria));
		
		produtoRepository.saveAll(Arrays.asList(primeiro_produto));
	}
	
	public void criarEstadoCidade() {
		
		Estado estado = new Estado(null, "São Paulo");
		
		Cidade cidades = new Cidade (null,"Guarulhos",estado);
		
		estadoRepository.save(estado);
	
		cidadeRepository.save(cidades);
		
	}

}

