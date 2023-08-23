package com.example.pokemon.entities;

import javax.persistence.*;

@Entity
@Table(name = "pokemon")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String nombre;

    @Column
    private String generacion;

    @Column
    private Double peso;

    @Column
    private Double altura;

    @Column
    private String genero;

    @Column
    private String color;

    @ManyToOne
    @JoinColumn(name="tipo_id", nullable=false)
    private Tipo tipo;

    public Pokemon() {
    }

    public Pokemon(int id, String nombre, String generacion, Double peso, Double altura, String genero, String color, Tipo tipo) {
        this.id = id;
        this.nombre = nombre;
        this.generacion = generacion;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
        this.color = color;
        this.tipo = tipo;
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

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
