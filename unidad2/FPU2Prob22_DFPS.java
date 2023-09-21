import javax.swing.JOptionPane;

public class FPU2Prob22_DFPS {
    public static void main(String[] args) {
        float costPerSimpleMeter=0F, customerRequest=0F;
        costPerSimpleMeter = 9.5F;

        String interactionMessage = String.format("Cotización trabajos de pintura\n\nCosto por metro cuadrado: %.2f\n¿Cuántos metros cuadrados quieres que pintemos?",Math.pow(costPerSimpleMeter,2));

        customerRequest = Float.parseFloat(JOptionPane.showInputDialog(interactionMessage));

        interactionMessage = String.format("El total será de $%.2f",Math.pow(costPerSimpleMeter,2)*customerRequest);

        JOptionPane.showMessageDialog(null,interactionMessage);
    }
}
