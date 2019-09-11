package com.codebyshiv.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebyshiv.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    Optional<Product> findByCode(String code);

}
