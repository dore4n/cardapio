package com.br.cardapio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.br.cardapio.DTO.FoodRequestDTO;
import com.br.cardapio.DTO.FoodResponseDTO;
import com.br.cardapio.model.Food;
import com.br.cardapio.repository.FoodRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;




@RestController
@RequestMapping("food")
public class FoodController {
    
    @Autowired
    private FoodRepository repository;


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
    
}
