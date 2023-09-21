import javax.swing.JOptionPane;

public class FPU2Prob24_DFPS {
    public static void main(String[] args) {
        float callTime=0F, costPerMinute=0F;
        callTime = 3.25F;

        String interactiveMessage = String.format("Costo por minuto llamadas nacionales: $%f\n\nIngresa el tiempo de la duración de la llamada en el formato MM.SS",callTime);
        costPerMinute = Float.parseFloat(JOptionPane.showInputDialog(interactiveMessage));

        JOptionPane.showMessageDialog(null,"El costo de la llamada será de $" + callTime*costPerMinute);
    }
}
