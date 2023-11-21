// Leer 8 números enteros, almacenarlos en un vector y determinar a cuánto es igual la suma de los dígitos pares de cada uno de los números leídos.

 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob33 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[8], evenSum = new int[8];
		int quotient=0, lastDigit=0;

		System.out.println("Ingresa 8 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		for (int i=0;i<numbers.length;i++) {
			quotient=numbers[i];

			if (quotient>0) {
				while(quotient>0) {
					lastDigit = quotient%10;
					quotient/=10;
		
					if (lastDigit%2==0) {
						evenSum[i]+=lastDigit;
					}
				}
			} else {
				while(quotient<0) {
					lastDigit = quotient%10;
					quotient/=10;
		
					if (lastDigit%2==0) {
						evenSum[i]+=lastDigit;
					}
				}
			}

		}

		for (int i=0;i<numbers.length;i++) {
			System.out.printf("%d: %d\n",numbers[i],evenSum[i]);
		}

		br.close();
	}
}
