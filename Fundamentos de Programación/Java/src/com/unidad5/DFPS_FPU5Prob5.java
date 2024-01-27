// Construir un método o función que reciba como parámetro un entero y regrese la cantidad de dígitos primos que posee.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU5Prob5 {
	public static void main(String[] args) throws IOException {
		int num = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("Ingresa un número: ");
		num = Integer.parseInt(br.readLine());

		System.out.printf("Cantidad de números primos: %d", primeCounter(num));
	}

	static int primeCounter(int numToEvaluate) {
	
	}
	
	static boolean primeVerify(int numToEvaluate) {
		
	}

}
