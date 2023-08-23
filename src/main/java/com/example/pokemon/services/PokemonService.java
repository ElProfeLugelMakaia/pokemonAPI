package com.example.pokemon.services;

import com.example.pokemon.entities.Pokemon;
import com.example.pokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private PokemonRepository repository;

    @Autowired
    public PokemonService(PokemonRepository repository){
        this.repository  = repository;
    }

    public Pokemon create(Pokemon p ){
        return this.repository.save(p);
    }
}
