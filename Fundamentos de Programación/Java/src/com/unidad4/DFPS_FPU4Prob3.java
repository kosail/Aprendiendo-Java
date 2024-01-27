// Leer 12 enteros, almacenarlos en un vector y determinar en qué posición del vector está el mayor número primo leído.
 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class DFPS_FPU4Prob3 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int[] numbers = new int[12];
	int biggestNumber = 0;
	byte positionBiggestNumber = -1;
	boolean primeNumber;

	bw.write("Ingresa 12 números enteros, uno a la vez: ");
	bw.flush();

	for (int i=0;i<numbers.length;i++) {
		numbers[i] = Integer.parseInt(br.readLine());
		
		primeNumber=true;

		if ((numbers[i]&1)!=0 && biggestNumber<numbers[i]) {
			for (int divider=2;divider<(numbers[i]/2);divider++) {
				if (numbers[i]%divider==0) {
					primeNumber = false;
					break;
				}
			}

			if (primeNumber) {
				biggestNumber = numbers[i];
				positionBiggestNumber = (byte) i;
			}
		}
	}

	if (biggestNumber!=-1) {
		bw.write("El mayor número primo leído está en la posición " + (positionBiggestNumber + 1)); // Sumándole 1 para que el output sea más intuitivo para los humanos, ya que nosotros comenzamos a contar en 1, en lugar de comenzar por 0.
	} else {
		bw.write("No se encontraron números primos.");
	}


	br.close();
	bw.close();
	}
}
