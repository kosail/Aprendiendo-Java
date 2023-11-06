// Leer 7 números enteros, almacenarlos en un vector y determinar cuántas veces en el vector se encuentra el dígito 2. Considere que el dígito 2 puede estar varias veces en un mismo número.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob34 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[7];
		int quotient=0, lastDigit=0, numberTwoCounter=0;

		System.out.println("Ingresa 7 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			quotient = numbers[i] = Integer.parseInt(br.readLine());

			if (quotient>0) {
				while(quotient>0) {
					lastDigit = quotient%10;
					quotient/=10;

					if (lastDigit==2) {
						numberTwoCounter++;
					}
				}
			} else {
				while(quotient<0) {
					lastDigit = quotient%10;
					quotient/=10;

					if (Math.abs(lastDigit)==2) {
						numberTwoCounter++;
					}
				}
			}

		}
		System.out.printf("El dígito 2 se encuentra %d veces.\n",numberTwoCounter);
		br.close();
	}
}