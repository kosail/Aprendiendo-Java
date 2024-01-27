// Leer 5 números enteros, almacenarlos en un vector y determinar cuántos números de los almacenados en dicho vector comienzan con 5.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob46 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[5];
		int quotient=0, counter=0;

		System.out.println("Ingresa 5 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			quotient = Math.abs(numbers[i] = Integer.parseInt(br.readLine()));

			while (((int) Math.floor(Math.log10(quotient)) + 1)>1) {
				quotient/=10;
			}

			if (quotient==5) {
				counter++;
			}
		}
		System.out.println(counter + " números comienzan por 5.");
		br.close();
	}
}
