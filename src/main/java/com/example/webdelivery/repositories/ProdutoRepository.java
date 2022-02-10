package com.example.webdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webdelivery.domain.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto,Integer> {

}
