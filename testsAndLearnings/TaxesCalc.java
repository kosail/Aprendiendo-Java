package testsAndLearnings;

 

import java.util.Scanner;

public class TaxesCalc{
    public static void main(String[] args){
        int amount;
        final double taxRate=0.16;

        Scanner amountScanned=new Scanner(System.in);
        System.out.print("Ingresa un monto al que le quieras calcular el impuesto:\n> ");
        amount=amountScanned.nextInt();
        amount+=amount*taxRate;
        System.out.print("El total es " + amount);
        amountScanned.close();
    }
}
