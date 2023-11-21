// Leer 3 números enteros, almacenarlos en un vector y determinar si existe al menos un número repetido.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob23 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[3];
		boolean presenceOFDuplicated=false;

		System.out.println("Ingresa 3 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		presenceOFDuplicated = numbers[0]==numbers[1] || numbers[0]==numbers[2] || numbers[1]==numbers[2];

		if (presenceOFDuplicated) {
			System.out.println("Existe al menos 1 número repetido.");
		} else {
			System.out.println("No hay números repetidos.");
		}

		br.close();
	}
}
