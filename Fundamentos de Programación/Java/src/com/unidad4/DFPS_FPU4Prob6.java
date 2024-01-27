// Leer dos números enteros y almacenar en un vector los 5 primeros números comprendidos entre el menor y el mayor. Luego mostrarlos en pantalla.
 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class DFPS_FPU4Prob6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] numbersBetween = new int[5];
		int number1=0, number2=0;
		byte indexCounter = 0;

		bw.write("Ingresa dos números enteros, uno a la vez: ");
		bw.flush();
		
		try {
			number1 = Integer.parseInt(br.readLine());
			number2 = Integer.parseInt(br.readLine());

			if (number1>number2) {
				number1^=number2;
				number2^=number1;
				number1^=number2;
			}
			
			for (int i=number1;indexCounter<numbersBetween.length;i++) {
				numbersBetween[indexCounter] = i;
				bw.write(numbersBetween[indexCounter] + " ");
				indexCounter++;
			}
			
			bw.flush();

		} catch (Exception e) {
			bw.write("An error has ocurred due to: " + e.getMessage());
		} finally {
			br.close();
			bw.close();
		}
	}
}
