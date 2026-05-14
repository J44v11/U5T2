package net.salesianos.utilidades;
import javax.swing.JOptionPane;

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
}
