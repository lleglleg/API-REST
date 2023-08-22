package com.practica.demo.domain.service;

import com.practica.demo.persistence.entity.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.practica.demo.persistence.entity.Result;
@Service
public class PokemonService {
    private final String apiUrl = "https://pokeapi.co/api/v2/pokemon"; // Cambia el número de Pokémon según necesites

    public Result getPokemon() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, Result.class);
    }
}
