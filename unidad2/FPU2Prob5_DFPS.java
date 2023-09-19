import java.util.Scanner;

public class FPU2Prob5_DFPS {
    public static void main(String[] args) {
        Scanner scannedUserNum = new Scanner(System.in);
        int userNum = 0, digitOne=0, digitTwo=0;

        do {
            System.out.print("Ingresa un número de dos dígitos: ");
            userNum = scannedUserNum.nextInt();
        } while (Math.abs(userNum)<10 || Math.abs(userNum)>99);

        scannedUserNum.close();
        digitOne = (int) userNum/10;
        digitTwo = userNum%10;

        if (digitOne%2==0 && digitTwo%2==0) {
            System.out.printf("Ambos digitos en el número %d son pares", userNum);
        } else {
            System.out.printf("Uno o ambos dígitos no son pares.");
        }
    }
}
