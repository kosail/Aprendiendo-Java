// Leer dos matrices de 4x5 enteras y determinar si la cantidad de números primos almacenados en una matriz es igual a la cantidad de números primos almacenados en la otra matriz.
package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob77 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		int[][] matrix1 = new int[4][5], matrix2 = new int[4][5];
		int matrix1OddCount = 0, matrix2OddCount = 0;
		boolean isPrime;

		for (int i=0;i<matrix1.length;i++) {
			for (int j=0;j<matrix1[i].length;j++) {
				isPrime = true;
				matrix1[i][j] = Integer.parseInt(br.readLine());

				if (matrix1[i][j]%2!=0) {
					for (int k=2;k<matrix1[i][j]/2;k++) {
						if (matrix1[i][j]%k==0) {
							isPrime = false;
						}
					}
					if (isPrime) {
						matrix1OddCount++;
					}
				}
			}
		}

		for (int i=0;i<matrix2.length;i++) {
			for (int j=0;j<matrix2[i].length;j++) {
				isPrime = true;
				matrix2[i][j] = Integer.parseInt(br.readLine());

				if (matrix2[i][j]%2!=0) {
					for (int k=2;k<matrix2[i][j]/2;k++) {
						if (matrix2[i][j]%k==0) {
							isPrime = false;
						}
					}
					if (isPrime) {
						matrix2OddCount++;
					}
				}
			}
		}

		if (matrix1OddCount==matrix2OddCount) {
			System.out.println("El total de números primos de la matriz 1 es igual que en la matrix 2");
		} else {
			System.out.println("El total de números primos no coincide entre matrices.");
		}

	br.close();
	}
}