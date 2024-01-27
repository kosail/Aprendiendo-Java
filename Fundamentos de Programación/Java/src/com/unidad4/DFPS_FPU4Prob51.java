// Leer una matriz de 4x4 entera y determinar en qué fila y en qué columna se encuentra el número mayor.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob51 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] numbers = new int[4][4];
		int biggestNumber = 0;
		String positionBiggestNumber = "";

		System.out.println("Ingresa 16 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			for (int j=0;j<numbers[i].length;j++) {
				numbers[i][j] = Integer.parseInt(br.readLine());

				if (numbers[i][j]>biggestNumber) {
					biggestNumber = numbers[i][j];
					positionBiggestNumber = String.format("Fila: [%d] Columna: [%d]",i,j);
				}
			}
		}

		System.out.println(positionBiggestNumber);
		br.close();
	}
}
