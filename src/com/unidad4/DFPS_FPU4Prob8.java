// Leer 9 números enteros, almacenarlos en un vector y determinar en qué posiciones se encuentran los números terminados en 4.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[9];
		int digits=0, lastdigit=0;

		System.out.println("Ingresa 9 números enteros, uno a la vez: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("Posición de los números que terminan en 4: ");
		for (int i=0;i<numbers.length;i++) {
			if (numbers[i]==4) {
				System.out.print((i+1) + " ");

			} else {
				digits = (int) Math.floor(Math.log10(numbers[i]));
				lastdigit = (int) (numbers[i]%Math.pow(10,digits));
				
				if (lastdigit==4) {
					System.out.print((i+1) + " ");
				}
			}
		}

		br.close();
	}
}
