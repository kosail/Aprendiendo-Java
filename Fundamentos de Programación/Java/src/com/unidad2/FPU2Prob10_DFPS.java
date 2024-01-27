package unidad2;

// Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales.

import javax.swing.JOptionPane;

public class FPU2Prob10_DFPS {
    public static void main(String[] args) {
        int userNum = 0, digitOne = 0, digitTwo = 0;

        do {
            userNum = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número de dos dígitos:"));
        } while (Math.abs(userNum)<10 || Math.abs(userNum)>99);

        digitOne = (int) userNum/10;
        digitTwo = userNum%10;

        if (digitOne==digitTwo) {
            JOptionPane.showMessageDialog(null, "Los dígitos son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "Los dígitos no son iguales.");
        }
    }
}
