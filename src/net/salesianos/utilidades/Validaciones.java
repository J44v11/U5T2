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
}
