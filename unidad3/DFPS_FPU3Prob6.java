// Leer un número entero de tres dígitos y mostrar todos los enteros comprendidos entre 1 y cada uno de los dígitos.
package unidad3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DFPS_FPU3Prob6 {
	public static void main(String[] args) throws java.io.IOException {
		int num=0;
		int[] digitsArray = new int[3];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("Ingresa un número entero de tres dígitos: ");
			num = Integer.parseInt(br.readLine());
		}while(Math.abs(num)<100 || Math.abs(num)>999);

		digitsArray[0] = (int) num/100;
		digitsArray[1] = (int) (num/10)%10;
		digitsArray[2] = num%10;

		for (int i=0;i<3;i++) {
			System.out.printf("Dígito %d: ", digitsArray[i]);

			if (num>0) {
				for (int j=1;j<=digitsArray[i];j++) {
					System.out.print(j + " ");
				}
			} else {
				for (int j=1;j>=digitsArray[i];j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println("");
		}
		br.close();
	}
}