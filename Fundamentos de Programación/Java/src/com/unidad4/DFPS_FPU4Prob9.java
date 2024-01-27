 
// Leer 7 números enteros, almacenarlos en un vector y determinar cuántas veces está repetido el número mayor.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[7];
		int biggestNumber=0, counterBiggestNumber=0;

		System.out.print("Ingresa 7 números enteros, uno por uno: ");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());

			if (biggestNumber<numbers[i]) {
				biggestNumber = numbers[i];
				counterBiggestNumber=1;
			} else if (biggestNumber==numbers[i]) {
				counterBiggestNumber++;
			}
		}

		System.out.printf("El número más grande se ha repetido %s veces.\n",counterBiggestNumber);

		br.close();
	}
}
