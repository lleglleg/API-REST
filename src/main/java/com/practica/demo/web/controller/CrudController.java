package com.practica.demo.web.controller;


import com.practica.demo.domain.service.PokemonService;
import com.practica.demo.persistence.entity.Pokemon;

import com.practica.demo.persistence.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CrudController {
    @Autowired
    private PokemonService pokemonService;
    @GetMapping("/pokemon")
    public Result Get(){
        return pokemonService.getPokemon();
    }

}
