import java.util.Scanner;

public class FPU2Prob17_DFPS {
    public static void main(String[] args) {
        int userNum=0, digit1=0, digit2=0, digit3=0;
        Scanner scannedUserNum = new Scanner(System.in);

        do {
            System.out.print("Ingresa un número de tres dígitos: ");
            userNum = scannedUserNum.nextInt();
        }while(Math.abs(userNum)<100 || Math.abs(userNum)>999);

        scannedUserNum.close();
        digit1 = (int) userNum/100;
        digit2 = (int) (userNum%100)/10;
        digit3 = userNum%10;

        if (digit1%digit2==0 || digit1%digit3==0 ||
            digit2%digit1==0 || digit2%digit3==0 ||
            digit3%digit1==0 || digit3%digit2==0) {
                System.out.print("Al menos un dígito es múltiplo de los otros.");
            } else {
                System.out.print("Ningún dígito es múltplo de los otros.");
            }

    }
}
