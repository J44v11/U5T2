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

    public void eliminarPlato(int posicionEnLista) {
        if (posicionEnLista >= 0 && posicionEnLista < listaPlatos.size()) {
            listaPlatos.remove(posicionEnLista);
        }
    }

    public Plato getPlato(int posicionEnLista) {
        if (posicionEnLista >= 0 && posicionEnLista < listaPlatos.size()) {
            return listaPlatos.get(posicionEnLista);
        }
        return null;
    }
    public int getTamaño() {
        return listaPlatos.size();
    }
}