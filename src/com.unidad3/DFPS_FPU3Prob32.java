// Leer números hasta que digiten 0 y determinar a cuánto es igual el promedio entero de los números primos leídos.

package unidad3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DFPS_FPU3Prob32 {
	public static void main(String[] args) throws java.io.IOException {
	int num, numSum, counter;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	do {
		num=numSum=counter=0;

		System.out.print("Ingresa un número: ");
		num = Integer.parseInt(br.readLine());

		for (int i=0;i<=num;i++) {
			if (i%2!=0) {
				numSum+=i;
				counter++;
			}
		}

		if (num!=0) {
			System.out.println(Math.round(numSum/counter));
		}

	}while(num!=0);

	br.close();
	}
}