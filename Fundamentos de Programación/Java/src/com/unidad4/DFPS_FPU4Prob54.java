// Leer una matriz de 4x3 entera y determinar en qué posiciones exactas se encuentran los números primos.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob54 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] numbers = new int[4][3];
		String oddNumbers = "";
		boolean isPrime = true;

		System.out.println("Ingresa 12 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			for (int j=0;j<numbers[i].length;j++) {
				numbers[i][j] = Integer.parseInt(br.readLine());

				if ((numbers[i][j]&1)!=0) {
					for (int k=2;k<numbers[i][j]/2;k++) {
						if (numbers[i][j]%k==0) {
							isPrime = false;
						}
					}
					if (isPrime) {
						oddNumbers = oddNumbers.concat(String.format("[%d, %d] ",i,j));
					}
				}
			}
		}
		System.out.println("Números primos: " + oddNumbers.trim());
		br.close();
	}
}
