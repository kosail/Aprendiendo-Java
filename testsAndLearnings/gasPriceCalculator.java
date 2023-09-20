package testsAndLearnings;

import java.util.Scanner;

public class gasPriceCalculator {
    public static void main(String[] args) {
        double gasLiters = 0, pesosAmount = 0;
        int userChoice = 0;
        final double GASPRICEPERLITER = 9.85;
        Scanner scannedUserChoice = new Scanner(System.in);

        do {
            System.out.print("¿Quieres cotizar en base a cuántos litros puedes comprar por X cantidad de pesos, o a cuánto costaría tantos litros de gas?\n1) Pesos en litros\n2) Litros en pesos\n3) Salir\n>> ");
            userChoice = scannedUserChoice.nextInt();
        } while( userChoice != 1 && userChoice != 2 && userChoice != 3);

        switch (userChoice) {
            case 1: 
            System.out.print("Ingresa la cantidad de pesos que quieres comprar en gas: ");
            pesosAmount = scannedUserChoice.nextDouble();
            System.out.printf("Por $%1.2f pesos puedes comprar %2.2f litros", pesosAmount,pesosAmount/GASPRICEPERLITER);
            break;

            case 2: 
            System.out.print("Ingresa los litros de gas que quieres comprar: ");
            gasLiters = scannedUserChoice.nextFloat();
            System.out.printf("Por %1.2f litros de gas, el precio es de $%2.2f",gasLiters, gasLiters*GASPRICEPERLITER);
            break;
            
            case 3:
            scannedUserChoice.close();
            System.exit(0);
        }
        scannedUserChoice.close();
    }
}