// Leer 8 números enteros, almacenarlos en un vector y determinar en qué posiciones se encuentran los números múltiplos de 10. No utilizar el número 10 en ninguna operación.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob47 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[8];
		String presenceOfTenDivisor="";

		System.out.println("Ingresa 8 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (numbers[i]%(5*2)==0) {
				presenceOfTenDivisor = presenceOfTenDivisor.concat((i+1) + " ");
			}
		}
		System.out.println("Posiciones: " + presenceOfTenDivisor);
		br.close();
	}
}
