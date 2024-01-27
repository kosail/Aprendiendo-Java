// Leer 6 números enteros, almacenarlos en un vector y determinar si el promedio entero de dichos números es un número primo.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob35 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[6];
		int arraySum = 0, average = 0;
		boolean isPrime=true;

		System.out.println("Ingresa 6 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			arraySum += numbers[i] = Integer.parseInt(br.readLine());
		}

		average = Math.abs((int) arraySum/numbers.length);
		if (average%2!=0) {
			for (int i=2;i<average/2;i++) {
				if (average/i==0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				System.out.println("El promedio entero es primo");	
			}
		} else {
			System.out.println("El promedio entero no es primo");
		} 

		br.close();
	}
}
