package com.example.pokemon.entities;

import javax.persistence.*;

@Entity
@Table(name = "grupo_huevo_pokemon")
public class GrupoHuevoPokemon {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    public GrupoHuevoPokemon() {
    }

    public GrupoHuevoPokemon(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
