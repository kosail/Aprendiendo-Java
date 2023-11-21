// Leer 12 números enteros, almacenarlos en un vector y calcular el promedio entero de los datos del vector.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[12];
		int average = 0;

		System.out.print("Ingresa 12 números enteros, uno a la vez: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			average+=numbers[i];
		}

		System.out.printf("El promedio es de %d", ((int) average/numbers.length));
		br.close();
	}
}
