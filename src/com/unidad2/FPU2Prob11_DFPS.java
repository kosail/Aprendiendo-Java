package unidad2;

// Leer dos números enteros y determinar cuál es el mayor

import javax.swing.JOptionPane;

public class FPU2Prob11_DFPS {
    public static void main(String[] args) {
        int userNumOne = 0, userNumTwo = 0;
        String resultsMessage = null;

        do {
            userNumOne = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número de dos dígitos:"));
        } while(Math.abs(userNumOne)<10 || Math.abs(userNumOne)>99);

        do {
            userNumTwo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un segundo número de dos dígitos:"));
        } while(Math.abs(userNumTwo)<10 || Math.abs(userNumTwo)>99);

        if (userNumOne>userNumTwo) {
            resultsMessage = String.format("%d es mayor que %d.", userNumOne, userNumTwo);
            JOptionPane.showMessageDialog(null, resultsMessage);
        } else if (userNumTwo>userNumOne) {
            resultsMessage = String.format("%d es mayor que %d.", userNumTwo, userNumOne);
            JOptionPane.showMessageDialog(null, resultsMessage);
        } else {
            resultsMessage = String.format("%d y %d son iguales.", userNumOne, userNumTwo);
            JOptionPane.showMessageDialog(null, resultsMessage);
        }

    }
}
