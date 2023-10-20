// Leer un número entero y determinar a cuánto es igual la suma de todos los enteros comprendidos entre 1 y el número leído
package unidad3;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class DFPS_FPU3Prob10 {
	public static void main(String[] args) throws java.io.IOException {
		int userNum=0, numSum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Ingresa un número entero: > ");
		userNum = Integer.parseInt(br.readLine());

		if (userNum>0) {
			for (int i=0;i<=userNum;i++) {
				numSum +=i;
			}
		} else {
			for (int i=0;i<=userNum;i--) {
				numSum +=i;
			}
		}

		System.out.println(numSum);
		br.close();
	}
}