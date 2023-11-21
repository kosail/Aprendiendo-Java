// Leer una matriz de 4x4 entera y determinar cuántas veces se repite en ella el número mayor.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob52 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] numbers = new int[4][4];
		int bigNum = 0, counter = 1;

		System.out.println("Ingresa 16 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			for (int j=0;j<numbers[i].length;j++) {
				numbers[i][j] = Integer.parseInt(br.readLine());

				if (numbers[i][j]==bigNum) {
					counter++;
				} else if (numbers[i][j]>bigNum) {
					bigNum = numbers[i][j];
					counter = 1;
				}
			}
		}
		System.out.printf("Repetido %d veces.\n Número mayor: %d\n",counter,bigNum);
		br.close();
	}
}
