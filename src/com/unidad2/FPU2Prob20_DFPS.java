package unidad2;

// Una empresa importadora desea determinar cuántos dólares puede adquirir con equis cantidad de dinero mexicano.

import javax.swing.JOptionPane;

public class FPU2Prob20_DFPS {
    public static void main(String[] args) {
        float mexicanPesosAmount=0F;
        final float CONVERSIONRATE=17.08F;
        String welcomeMessageFormatted = String.format("Conversor Pesos Mexicanos (MXN) a Dólares Americanos (USD)\nNuestra tarifa es de %.2f MXN por cada 1 USD\n--------------------------------------------\nIngresa la cantidad de MXN que quieres cambiar en USD: ",CONVERSIONRATE);
        mexicanPesosAmount = Float.parseFloat(JOptionPane.showInputDialog(welcomeMessageFormatted));

        welcomeMessageFormatted = String.format("La cantidad de USD que puedes comprar con %.2f MXN es de %.2f USD.",mexicanPesosAmount,mexicanPesosAmount/CONVERSIONRATE);

        JOptionPane.showMessageDialog(null, welcomeMessageFormatted);
    }
}
