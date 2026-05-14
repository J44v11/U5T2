package net.salesianos.modelo;
import java.util.ArrayList;

public class GestorPlatos {
    private ArrayList<Plato> listaPlatos;

    public GestorPlatos() {
        this.listaPlatos = new ArrayList<>();
    }

    public void añadirPlato(Plato p) {
        listaPlatos.add(p);
    }
}