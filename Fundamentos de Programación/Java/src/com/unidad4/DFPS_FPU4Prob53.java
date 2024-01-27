// Leer una matriz de 3x4 entera y determinar en qué posiciones exactas (fila y columna) se encuentran los números pares.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob53 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] numbers = new int[3][4];
		String evenPositions="";

		System.out.println("Ingresa 12 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			for (int j=0;j<numbers[i].length;j++) {
				numbers[i][j] = Integer.parseInt(br.readLine());

				if (numbers[i][j]%2==0) {
					evenPositions = evenPositions.concat(String.format("[%d, %d] ",i,j));
				}
			}
		}
		System.out.printf("Pares en las posiciones: %s",evenPositions.trim());
		br.close();
	}
}
