// Leer 9 números enteros, almacenarlos en un vector. Luego leer un entero y determinar cuántos números de los almacenados en el vector terminan en el mismo digito que el último valor leído.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob32 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[9];
		int lastReadNumber=0, counter=0;

		System.out.println("Ingresa 9 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("Ingresa un número entero: ");
		lastReadNumber = Integer.parseInt(br.readLine());

		for (int i=0;i<numbers.length;i++) {
			if (Math.abs(lastReadNumber%10)==Math.abs(numbers[i]%10)) {
				counter++;
			}
		}
		System.out.println(counter + " números en el vector terminan con el mismo dígito.");
		br.close();
	}
}
