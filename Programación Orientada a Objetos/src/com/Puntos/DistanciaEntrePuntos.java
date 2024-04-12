import javax.swing.JOptionPane;

public class DistanciaEntrePuntos {
    public static void main(String[] args) {
        Punto A, B;
        double x1, y1, x2, y2;

        x1 = Double.parseDouble(JOptionPane.showInputDialog("Dame X1:"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Dame Y1:"));
        A = new Punto(x1, y1);

        x2 = Double.parseDouble(JOptionPane.showInputDialog("Dame X2:"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Dame Y2:"));
        B = new Punto(x2, y2);

        JOptionPane.showMessageDialog(null, "Distancia entre A y B: " + A.calcularDistancia(B));
        JOptionPane.showMessageDialog(null, "Distancia entre A y A: " + A.calcularDistancia(A));
        JOptionPane.showMessageDialog(null, "Distancia entre B y A: " + B.calcularDistancia(A));
    }
}