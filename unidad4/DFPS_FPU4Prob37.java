// Leer 6 números enteros, almacenarlos en un vector y determinar a cuántos es igual la suma del cuadrado de cada uno de los números leídos.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob37 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[6];
		int arraySquaredSum = 0;

		System.out.println("Ingresa 6 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			arraySquaredSum += Math.pow(numbers[i] = Integer.parseInt(br.readLine()),2);
		}

		System.out.println("La suma del cuadrado del vector es: " + arraySquaredSum);
		br.close();
	}
}