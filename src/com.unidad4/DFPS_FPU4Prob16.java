// Leer 8 números enteros, almacenarlos en un vector y mostrar las posiciones del arreglo que contengan múltiplos de 4.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob16 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[8];
		String positions = "";

		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (numbers[i]%4==0) {
				positions = positions.concat((i+1) + " "); // Sumando 1 para hacer el output más amigable con los humanos, que cuentan a partir de 1 en lugar de 0.
			}
		}

		System.out.println("Los múltiplos de 4 están en las posiciones: " + (positions));
		br.close();
	}
}