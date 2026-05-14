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

    public void editarPlato(int posicionEnLista, Plato p) {
        if (posicionEnLista >= 0 && posicionEnLista < listaPlatos.size()) {
            listaPlatos.set(posicionEnLista, p);
        }
    }

    public ArrayList<Plato> getPlatosOrdenados() { // LISTA ORDENADA DE MAYOR A MENOR PUNTUACIÓN USANDO EL METODO
                                                   // BURBUJA (hecha con ayuda de la IA porque no sabia como hacerlo)

        // Creamos la copia exacta usando new ArrayList con el constructor copia
        ArrayList<Plato> copia = new ArrayList<>(listaPlatos);

        // Usamos el Metodo Burbuja para ordenar de mayor a menor puntuación
        for (int i = 0; i < copia.size() - 1; i++) { // Recorremos la lista tantas veces como elementos tenga menos uno
            for (int j = 0; j < copia.size() - 1 - i; j++) { // Recorremos la lista comparando cada elemento con el
                                                             // siguiente, pero sin llegar al final de la lista (menos i
                                                             // para no comparar los elementos ya ordenados al final)

                // Si la puntuación del plato actual es MENOR que la del plato siguiente
                // entonces los intercambiamos de posición usando una variable temporal
                if (copia.get(j).getPuntuacion() < copia.get(j + 1).getPuntuacion()) {

                    Plato platoTemporal = copia.get(j); // Guardamos el plato actual en una variable temporal

                    copia.set(j, copia.get(j + 1)); // El plato siguiente pasa a la posición del plato actual

                    copia.set(j + 1, platoTemporal); // El plato actual (guardado en la variable temporal) pasa a la
                                                     // posición del plato siguiente
                }
            }
        }

        // Devolvemos la copia ya ordenada
        return copia;
    }
}