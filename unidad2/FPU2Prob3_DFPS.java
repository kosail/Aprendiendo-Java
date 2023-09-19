import java.util.Scanner;

public class FPU2Prob3_DFPS {
    public static void main(String[] args) {
        int userNum = 0;
        boolean validationOfNumber = false;
        Scanner scannedUserNum = new Scanner (System.in);
        
        System.out.print("Ingresa un número: ");
        userNum = scannedUserNum.nextInt();
        
        if (userNum<0) {
            validationOfNumber = true;
        }

        System.out.printf("¿El número %d es negativo?: %b",userNum,validationOfNumber);
        // el %d es para ingresar dígitos en el printf
        scannedUserNum.close();

    }
}
