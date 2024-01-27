// Leer 9 números enteros, almacenarlos en un vector y mostrar en pantalla todos los enteros comprendidos entre 1 y cada uno de los dígitos de cada uno de los números almacenados en el vector.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob29 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[8];
		int quotient = 0, lastDigit=0;

		System.out.println("Ingresa 9 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		for (int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i] + ": ");
			quotient = numbers[i];

			do {
				lastDigit = quotient%10;
				quotient/=10;

				System.out.printf("   %d: ",lastDigit);
				if (lastDigit>0) {
					for (int j=1;j<=lastDigit;j++) {
						System.out.print(j + " ");
					}
				} else {
					for (int j=lastDigit;j<=1;j++) {
						System.out.print(j + " ");
					}
				}
				
				System.out.println();
			} while(quotient>0);

			System.out.println();
		}


		br.close();
	}
}
