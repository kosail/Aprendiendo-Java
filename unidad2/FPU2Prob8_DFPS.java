package unidad2;

// Leer un número entero de dos dígitos y determinar si sus dos dígitos son primos.

import javax.swing.JOptionPane;

public class FPU2Prob8_DFPS {
    public static void main(String[] args) {
        int userNum = 0, digitOne = 0, digitTwo = 0;

        do {
        userNum = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número de dos dígitos:"));
        } while(Math.abs(userNum)<=9 || Math.abs(userNum)>=100);
        
        digitOne = (int) userNum/10;
        digitTwo = userNum%10;

        if (digitOne%2!=0 && digitTwo%2!=0) {
            JOptionPane.showMessageDialog(null, "Ambos dígitos son primos.");
        } else {
            JOptionPane.showMessageDialog(null, "Uno o ambos de los dígitos no son primos.");
        }

    }
}
