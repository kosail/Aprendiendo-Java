// Leer 15 números enteros, almacenarlos en un vector y determinar cuántos datos almacenados son múltiplos de 6.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob15 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[15];
		byte counter=0;

		System.out.print("Ingresa 15 números enteros, uno a la vez: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (numbers[i]%6==0) {
				counter++;
			}
		}

		System.out.printf("Hay %d múltiplos de 6 en el vector.",counter);
		br.close();
	}
}
