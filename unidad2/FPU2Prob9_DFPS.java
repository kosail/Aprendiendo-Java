package unidad2;

// Leer un número entero de dos dígitos y determinar si un dígito es múltiplo del otro.

import javax.swing.JOptionPane;

public class FPU2Prob9_DFPS {
    public static void main(String[] args) {
        int userNum = 0, digitOne = 0, digitTwo = 0;
        String resultsMessage = null;

        do {
            userNum = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número de dos dígitos:"));
        } while(Math.abs(userNum)<10 || Math.abs(userNum)>99);

        digitOne = (int) userNum/10;
        digitTwo = userNum%10;

        if (digitOne%digitTwo==0) {
            resultsMessage = String.format("%d es un múltiplo de %d",digitTwo,digitOne);
            JOptionPane.showMessageDialog(null, resultsMessage);
        } else if (digitTwo%digitOne==0) {
            resultsMessage = String.format("%d es un múltiplo de %d",digitOne,digitTwo);
            JOptionPane.showMessageDialog(null, resultsMessage);
        } else {
            JOptionPane.showMessageDialog(null, "Los dígitos no coinciden como múltiplos.");
        }
    }
}
