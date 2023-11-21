//  Leer 5 números enteros, almacenarlos en un vector y determinar cuántos dígitos impares hay en los números leídos. Considere que un número puede tener varios dígitos impares.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob36 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[5];
		int quotient=0, lastDigit=0, oddCounter=0;

		System.out.println("Ingresa 5 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			quotient = numbers[i] = Integer.parseInt(br.readLine());

			if (quotient>0) {
				while(quotient>0) {
					lastDigit = quotient%10;
					quotient/=10;

					if (lastDigit%2!=0) {
						oddCounter++;
					}
				}
			} else {
				while(quotient<0) {
					lastDigit = quotient%10;
					quotient/=10;

					if (lastDigit%2!=0) {
						oddCounter++;
					}
				}
			}

		}
		System.out.printf("Hay %d digitos impares.\n",oddCounter);

		br.close();
	}
}
