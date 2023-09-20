import java.util.Scanner;
public class FPU2Prob13_DFPS {
    public static void main(String[] args) {
        int userNum1=0, userNum2=0;
        Scanner scannedUserInput = new Scanner (System.in);

        do {
            System.out.print("Ingresa un primer número de dos dígitos: ");
            userNum1 = scannedUserInput.nextInt();
        } while(Math.abs(userNum1)<10 || Math.abs(userNum1)>99);

        do {
            System.out.print("Ingresa un segundo número de dos dígitos:");
            userNum2 = scannedUserInput.nextInt();
        } while(Math.abs(userNum2)<10 || Math.abs(userNum2)>99);

        System.out.println("+-------------------------+");
        if ((userNum1+userNum2)%2==0) {
            System.out.print("La suma de los dos números origina un número par.");
        } else {
            System.out.print("La suma de estos dos números no origina un número par.");
        }
        scannedUserInput.close();
    }
}
