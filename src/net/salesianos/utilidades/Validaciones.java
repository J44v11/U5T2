package net.salesianos.utilidades;
import javax.swing.JOptionPane;

/**
 * Esta clase es una utilidad que proporciona métodos estáticos para solicitar datos al usuario
 * de forma segura a través de diálogos gráficos. Cada método está especializado en un tipo de
 * dato diferente: hay un método para solicitar números enteros, otro para números decimales y
 * otro para cadenas de texto. Todos los métodos incluyen validación y manejo automático de errores,
 * de manera que si el usuario introduce un dato con formato incorrecto, el programa le muestra
 * un mensaje de error y vuelve a pedir el dato. También permiten que el usuario cancele la entrada
 * retornando valores especiales como -1 para indicar cancelación.
 */
public class Validaciones {
    
    public static int solicitarEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if (input == null) return -1; 
                return Integer.parseInt(input); 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Se ha cometido un error. Debes introducir un numero entero.");
            }
        }
    }

    public static double solicitarDouble(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if (input == null) return -1.0;
                return Double.parseDouble(input.replace(",", ".")); // Por si el usuario usa coma, las reemplazamos por punto
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Se ha cometido un error. Debes introducir un numero decimal valido.");
            }
        }
    }

    public static String solicitarString(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);

        while (input != null && input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se ha cometido un error. El texto no puede estar vacio.");
            input = JOptionPane.showInputDialog(mensaje);
        }

        return input;
    }
}
