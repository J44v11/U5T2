import net.salesianos.modelo.GestorPlatos;
import net.salesianos.modelo.Plato;
import net.salesianos.utilidades.Validaciones;
import javax.swing.JOptionPane;

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
                
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta.");
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Se ha producido un error inesperado: " + error.getMessage());
            }
        }
    }
}