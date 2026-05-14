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
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Se ha producido un error inesperado: " + error.getMessage());
            }
        }
    }
}