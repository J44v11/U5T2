import net.salesianos.modelo.GestorPlatos;
import net.salesianos.modelo.Plato;
import net.salesianos.utilidades.Validaciones;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        GestorPlatos gestor = new GestorPlatos();
        boolean salir = false;

        while (!salir) {
            try {
                String menu = "Gestión de Platos\n"
                        + "1. Añadir Plato\n"
                        + "2. Editar Plato\n"
                        + "3. Mostrar Platos (Ranking)\n"
                        + "4. Eliminar Plato\n"
                        + "5. Salir\n\n"
                        + "Elige una opción:";

                int opcion = Validaciones.solicitarEntero(menu);

                switch (opcion) {

                    case 1:
                        String nombre = Validaciones.solicitarString("Nombre del plato:");
                        if (nombre == null) break;
                        String tipo = Validaciones.solicitarString("Tipo (Entrante, Primer plato, Segundo plato, Postre):");
                        if (tipo == null) break;
                        double precio = Validaciones.solicitarDouble("Precio del plato:");
                        if (precio == -1.0) break;
                        int puntuacion = Validaciones.solicitarEntero("Puntuacion (1-5):");
                        if (puntuacion == -1) break;

                        gestor.añadirPlato(new Plato(nombre, tipo, precio, puntuacion));
                        JOptionPane.showMessageDialog(null, "Plato añadido correctamente.");
                        break;
                    
                    case 2:
                        int posicionPlatoEnLista = Validaciones.solicitarEntero("Introduce el número de lista del plato a editar (0 a " + (gestor.getTamaño() - 1) + "):"); // Pedimos al usuario la posición del plato a editar, mostrando el rango válido según el tamaño de la lista
                        if (posicionPlatoEnLista == -1) break; // Si el usuario cancela, salimos del caso sin hacer nada
                        Plato platoExistente = gestor.getPlato(posicionPlatoEnLista); // Obtenemos el plato existente en esa posición para mostrar sus datos actuales
                        
                        if (platoExistente != null) {
                            String nuevoNombre = Validaciones.solicitarString("Nuevo nombre (Actual: " + platoExistente.getNombre() + "):");
                            String nuevoTipo = Validaciones.solicitarString("Nuevo tipo (Actual: " + platoExistente.getTipo() + "):");
                            double nuevoPrecio = Validaciones.solicitarDouble("Nuevo precio (Actual: " + platoExistente.getPrecio() + "):");
                            int nuevaPuntuacion = Validaciones.solicitarEntero("Nueva puntuacion (Actual: " + platoExistente.getPuntuacion() + "):");
                            
                            gestor.editarPlato(posicionPlatoEnLista, new Plato(nuevoNombre, nuevoTipo, nuevoPrecio, nuevaPuntuacion));
                            JOptionPane.showMessageDialog(null, "Plato actualizado.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Plato no encontrado.");
                        }
                        break;

                    case 3: 
                        if (gestor.getTamaño() == 0) {
                            JOptionPane.showMessageDialog(null, "No hay platos guardados.");
                            break;
                        }

                        String textoRanking = "RANKING DE PLATOS:\n\n";

                        ArrayList<Plato> platosOrdenados = gestor.getPlatosOrdenados();
                        for (int posicion = 0; posicion < platosOrdenados.size(); posicion++) {
                            Plato plato = platosOrdenados.get(posicion);
                            textoRanking += (posicion + 1) + ". " + plato.toString() + "\n";
                        }

                        JOptionPane.showMessageDialog(null, textoRanking);
                        break;
                    
                    case 4:
                        int platoParaEliminar = Validaciones.solicitarEntero("Introduce el numero de plato en lista a eliminar (0 a " + (gestor.getTamaño() - 1) + "):");
                        if (platoParaEliminar != -1) {
                            gestor.eliminarPlato(platoParaEliminar);
                            JOptionPane.showMessageDialog(null, "He encontrado el plato. Ahora ha sido eliminado.");
                        }
                        break;
                
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Se ha producido un error inesperado: " + error.getMessage());
            }
        }
    }

    
}