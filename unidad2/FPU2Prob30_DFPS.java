import javax.swing.JOptionPane;

public class FPU2Prob30_DFPS {
    public static void main(String[] args) {
        float previousBalance=0F, purchaseHistoryAmount=0F, previousBillPayment=0F;
        float actualBalance=0F, minPaymentWithGenerates=0F, minPaymentWithoutGenerates=0F;

        previousBalance = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el anterior balance de la cuenta:"));
        purchaseHistoryAmount = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el monto de compras que realizó el cliente:"));
        previousBillPayment = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el monto del pago que depositó en el último corte:"));

        actualBalance = previousBalance + purchaseHistoryAmount - previousBillPayment;
        minPaymentWithGenerates = actualBalance * 0.15F;
        minPaymentWithoutGenerates = actualBalance * 0.85F + actualBalance * 0.12F + 200F;

        String resultsMessage = String.format("El saldo actual: $%.2f\nPago mínimo: $%.2f\nPago mínimo sin intereses: $%.2f",actualBalance, minPaymentWithGenerates, minPaymentWithoutGenerates);
        System.out.print(resultsMessage);
        JOptionPane.showMessageDialog(null, resultsMessage);
    }
}
