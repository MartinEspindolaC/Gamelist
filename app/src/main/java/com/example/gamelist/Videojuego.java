package com.example.gamelist;

public class Videojuego {

    // Datos que tendrá cada videojuego.
    private String nombre;
    private String genero;
    private String descripcion;

    // Constructor: permite crear un videojuego con sus datos.
    public Videojuego(String nombre, String genero, String descripcion) {
        this.nombre = nombre;
        this.genero = genero;
        this.descripcion = descripcion;
    }

    // Métodos para obtener los datos.
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescripcion() {
        return descripcion;
    }
}