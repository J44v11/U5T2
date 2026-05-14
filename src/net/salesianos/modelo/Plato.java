package net.salesianos.modelo;

public class Plato {
    private String nombre;
    private String tipo;
    private double precio;
    private int puntuacion;

    public Plato(String nombre, String tipo, double precio, int puntuacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.puntuacion = puntuacion;
    }
}
