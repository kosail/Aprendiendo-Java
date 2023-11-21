// Leer 9 enteros, almacenarlos en un vector y determinar en qué posición del vector está el mayor número par leído.

 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class DFPS_FPU4Prob2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] numbers = new int[9];
		int biggerNumber = 0;
		byte positionBiggerNumber = 0;

		bw.write("Ingresa 9 números uno a la vez: ");
		bw.flush();

		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if ((numbers[i]&1)==0 && biggerNumber<numbers[i]) {
				biggerNumber = numbers[i];
				positionBiggerNumber = (byte) i;
			}
		}

		bw.write("La posición del número mayor par leído es: " + (positionBiggerNumber + 1)); // Sumándole 1 para que el output sea más intuitivo para los humanos, ya que nosotros comenzamos a contar en 1, en lugar de comenzar por 0.
		bw.close();
		br.close();
	}
}
