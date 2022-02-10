package com.example.webdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webdelivery.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
