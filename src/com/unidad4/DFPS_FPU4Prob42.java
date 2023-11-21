// Leer 9 números enteros, almacenarlos en un vector y determinar cuántos números con cantidad par de dígitos pares hay almacenados en dicho vector.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob42 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[9];
		int numberOfDigits=0, quotient=0, lastDigit=0, pairChecker=0, counter=0;

		System.out.println("Ingresa 9 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			quotient = Math.abs(numbers[i] = Integer.parseInt(br.readLine()));
			numberOfDigits = (int) Math.floor(Math.log10(Math.abs(numbers[i]))) + 1;
			
			if (numberOfDigits%2==0) {
				pairChecker = 0;
				
				while(quotient>0) {
					lastDigit = quotient%10;
					quotient/=10;

					if (lastDigit%2==0) {
						pairChecker++;
					}
				}

				if (pairChecker==numberOfDigits) {
					counter++;
				}
			}
		}
		System.out.printf("Hay %d dígitos con cantidad par de dígitos.", counter);
		br.close();
	}
}
