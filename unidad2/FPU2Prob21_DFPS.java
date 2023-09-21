import java.util.Scanner;

public class FPU2Prob21_DFPS {
    public static void main(String[] args) {
        int ratePerHour=0, amountToPay=0;
        float hoursStayed=0;
        ratePerHour = 20;
        Scanner scannedHoursStayed = new Scanner (System.in);

        System.out.print("+-----------------------------------+\nCalculadora de costos de parking\n+-----------------------------------+\n*Considera que las fracciones de hora se toman como completas*\n\nIngresa la cantidad de horas que estuviste en el estacionamiento: ");
        hoursStayed = scannedHoursStayed.nextFloat();
        
        scannedHoursStayed.close();
        amountToPay = Math.round(ratePerHour*hoursStayed);

        System.out.printf("El monto que debes pagar es de %d MXN.", amountToPay);
    }
}
