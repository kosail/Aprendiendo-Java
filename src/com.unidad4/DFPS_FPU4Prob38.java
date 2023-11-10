// Leer 7 números enteros, almacenarlos en un vector y determinar si la semisuma entre el valor mayor y el valor menor es un número par. La semisuma es la mitad de la suma de dos o más números.

package unidad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob38 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[7];
		int highestNum=0, lowestNum=0;

		System.out.println("Ingresa 7 números enteros, uno a la vez:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		highestNum = lowestNum = numbers[0];
		for (int i=0;i<numbers.length;i++) {
			if (numbers[i]>highestNum) {
				highestNum = numbers[i];
			} else if (numbers[i]<lowestNum) {
				lowestNum= numbers[i];
			}
		}

		if (((highestNum+lowestNum)/2)%2==0) {
			System.out.println("La semisuma es par.");
		} else {
			System.out.println("La semisuma es impar.");
		}

		br.close();
	}
}