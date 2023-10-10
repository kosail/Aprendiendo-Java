package unidad2;

// Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan. Considere que el cobro es con base en las horas que lo utilizan y que las fracciones de hora se toman como completas.

import java.util.Scanner;

public class FPU2Prob21_DFPS {
    public static void main(String[] args) {
        int ratePerHour=0, amountToPay=0, hoursStayed=0, minutesStayed=0;
        ratePerHour = 20;
        Scanner scannedTimeStayed = new Scanner (System.in);

        System.out.print("+-----------------------------------+\nCalculadora de costos de parking\n+-----------------------------------+\n*Considera que las fracciones de hora se toman como completas*\n\nIngresa la cantidad de horas que estuviste en el estacionamiento: ");
        hoursStayed = scannedTimeStayed.nextInt();

        do {
            System.out.print("Ingresa la cantidad de minutos: ");
            minutesStayed = scannedTimeStayed.nextInt();
        } while(minutesStayed<0 || minutesStayed>60);

        if (minutesStayed == 0) {
            amountToPay = ratePerHour*hoursStayed;
        } else {
            amountToPay = ratePerHour*(hoursStayed+1);
        }

        System.out.printf("El monto que debes pagar es de %d MXN.", amountToPay);
        scannedTimeStayed.close();
    }
}
