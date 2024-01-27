package unidad2;

// Leer dos números enteros de dos digitos y determinar si tienen digitos comunes.

import javax.swing.JOptionPane;

public class FPU2Prob12_DFPS {
    public static void main(String[] args) {
        int userNum1=0, userNum2=0, digitOneOne=0, digitOneTwo=0, digitTwoOne=0, digitTwoTwo=0;

        do {
            userNum1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número de dos dígitos:"));
        } while(Math.abs(userNum1)<10 || Math.abs(userNum1)>99);

        do {
            userNum2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un segundo número de dos dígitos:"));
        } while(Math.abs(userNum2)<10 || Math.abs(userNum2)>99);

        digitOneOne = Math.abs((int) userNum1/10);
        digitOneTwo = Math.abs((int) userNum2/10);
        digitTwoOne = Math.abs(userNum1%10);
        digitTwoTwo = Math.abs(userNum2%10);

        if (digitTwoOne==digitOneOne || digitTwoOne==digitOneTwo || digitTwoTwo==digitOneOne || digitTwoTwo==digitOneTwo) {
            JOptionPane.showMessageDialog(null, "Los números tienen dígitos en común.");
        } else {
            JOptionPane.showMessageDialog(null, "Los números no tienen dígitos en común.");
        }

    }
}
