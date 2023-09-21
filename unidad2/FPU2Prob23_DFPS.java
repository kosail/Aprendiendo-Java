import javax.swing.JOptionPane;

public class FPU2Prob23_DFPS {
    public static void main(String[] args) {
        float circleRadius=0F;
        String resultsMessage = null;

        circleRadius = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el radio del círculo"));

        resultsMessage = String.format("El área del círculo es de %.2f", Math.PI*Math.pow(circleRadius,2));
        
        JOptionPane.showMessageDialog(null,resultsMessage);
        

    }
}
