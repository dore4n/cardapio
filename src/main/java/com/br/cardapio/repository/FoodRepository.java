package com.br.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.cardapio.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
