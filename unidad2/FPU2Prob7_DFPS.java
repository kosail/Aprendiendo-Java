import javax.swing.JOptionPane;

public class FPU2Prob7_DFPS {
    public static void main(String[] args) {
        int userNum = 0;

        userNum = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número de dos dígitos:"));

        if (userNum>=-99 && userNum<=-10) {
            if (userNum%2!=0 && userNum<0) {
                JOptionPane.showMessageDialog(null,"El número es primo y es negativo.");
            } else {
                JOptionPane.showMessageDialog(null,"El número no cumple con las condiciones de ser primo y negativo.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"El número que ingresaste tiene más o menos de 2 dígitos.\nVuelve a intentarlo.");
        }

    }
}
