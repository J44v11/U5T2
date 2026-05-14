package net.salesianos.modelo;

/**
 * Esta clase representa un plato de comida dentro del sistema. Almacena toda la información
 * relevante de un plato como su nombre, el tipo de plato que es, su precio y la puntuación
 * que ha recibido. La clase proporciona métodos getter y setter para acceder y modificar cada
 * uno de estos atributos, permitiendo que otros objetos del programa trabajen con los datos
 * del plato. Además, incluye un método toString() que formatea la información del plato de
 * manera legible para mostrarla al usuario.
 */
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

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getPuntuacion() { return puntuacion; }
    public void setPuntuacion(int puntuacion) { this.puntuacion = puntuacion; }

    @Override
    public String toString() {
        return "Tiene una puntuación de " + puntuacion + "estrellas. | " + nombre + " (" + tipo + ") - " + precio + "€";
    }
}
