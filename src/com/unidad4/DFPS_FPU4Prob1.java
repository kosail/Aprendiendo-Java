// Leer 6 enteros, almacenarlos en un vector y determinar en qué posición del vector está el mayor número leído.

 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class DFPS_FPU4Prob1 {
	public static void main(String[] args) throws IOException {
		int[] numbers = new int[6];
		int biggerNumber = 0;
		byte positionBiggerNumber = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			bw.write("Ingresa 6 números, uno por uno: ");
			bw.flush();

			for (int i=0;i<numbers.length;i++) {
				numbers[i] = Integer.parseInt(br.readLine());
				
				if (biggerNumber<numbers[i]) {
					biggerNumber = numbers[i];
					positionBiggerNumber = (byte) i;
				}

			}

			bw.write("La posición del número mayor es: " + (positionBiggerNumber + 1)); // Sumándole 1 para que el output sea más intuitivo para los humanos, ya que nosotros comenzamos a contar en 1, en lugar de comenzar por 0.
			bw.newLine();

		} catch (IOException e) {
			bw.write("An error has ocurred: " + e.getMessage());
			bw.newLine();
			bw.write("Details:\n" + e);
		} finally {
			br.close();
			bw.close();
		}
	}
}
