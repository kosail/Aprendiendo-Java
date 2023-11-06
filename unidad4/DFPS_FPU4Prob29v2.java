// Leer 9 números enteros, almacenarlos en un vector y mostrar en pantalla todos los enteros comprendidos entre 1 y cada uno de los dígitos de cada uno de los números almacenados en el vector.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class DFPS_FPU4Prob29v2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[8];
		int quotient = 0, lastDigit=0, actualNum=0;

		System.out.println("Ingresa 9 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		for (int i=0;i<numbers.length;i++) {
			ArrayDeque<Integer> numStack = new ArrayDeque<>();
			quotient = numbers[i];

			System.out.println(numbers[i] + ": ");

			do {
				lastDigit = quotient%10;
				quotient/=10;	
				numStack.push(lastDigit);
			} while(quotient>0);

			while (!numStack.isEmpty()) {
				actualNum = numStack.pop();

				System.out.printf("   %d: ",actualNum);
				if (actualNum>0) {
					for (int j=1;j<=actualNum;j++) {
						System.out.print(j + " ");
					}
				} else {
					for (int j=actualNum;j<=i;j++) {
						System.out.print(j + " ");
					}
				}

				System.out.println();
			}

			System.out.println();
		}

		br.close();
	}
}