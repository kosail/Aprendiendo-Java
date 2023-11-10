// Leer un número entero y mostrar todos los enteros desde 1 hasta el número leído.
package unidad3;

import java.util.Scanner;

public class DFPS_FPU3Prob1 {
	public static void main(String[] args) {
		int userNum=0;

		System.out.print("Ingresa un número: > ");
		Scanner scanner = new Scanner(System.in);

		do {
			userNum = scanner.nextInt();
		}	while(Math.abs(userNum)==1);	

		if (userNum>=0) {
			for (int i=1;i<userNum;i++) {
				System.out.print(i + " ");
			}
		} else if (userNum<=0) {
			for (int i=1;i<userNum;i--) {
				System.out.print(i + " ");
			}
		}
		
		scanner.close();
	}
}