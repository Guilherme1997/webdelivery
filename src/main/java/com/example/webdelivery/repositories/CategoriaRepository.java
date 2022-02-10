package com.example.webdelivery.repositories;

import org.springframework.stereotype.Repository;

import com.example.webdelivery.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
