package com.br.cardapio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("food")
public class FoodController {
    @GetMapping
    public void getAll() {
        
    }
    
}
