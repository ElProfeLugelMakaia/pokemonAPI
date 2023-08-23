package com.example.pokemon.controllers;

import com.example.pokemon.entities.Pokemon;
import com.example.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pokemon")
public class PokemonController {

    private PokemonService service;

    @Autowired
    public PokemonController(PokemonService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity create(@RequestBody() Pokemon p){
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.service.create(p));

        } catch (Exception ex){
            return ResponseEntity.internalServerError().build();

        }
    }
}
