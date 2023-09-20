import javax.swing.JOptionPane;

public class FPU2Prob6_DFPS {
    public static void main(String[] args) {
        int userNum = 0;

        userNum = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número de dos dígitos menor que 20:"));
        
        if (-99<=userNum && userNum<=20) {
            if (userNum%2!=0) {
                JOptionPane.showMessageDialog(null,"El número es primo.");
            } else {
                JOptionPane.showMessageDialog(null,"El número no es primo.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"El número que ingresaste es mayor que 20 o sobrepasa los 2 dígitos negativos.\nVuelve a intentarlo.");
        }

    }    
}
