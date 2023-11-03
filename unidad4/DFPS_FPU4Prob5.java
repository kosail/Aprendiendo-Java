// Almacenar en un vector de 10 posiciones los 10 primeros números primos comprendidos entre 100 y 300. Luego mostrarlos en pantalla.
package unidad4;

public class DFPS_FPU4Prob5 {
	public static void main(String[] args) {
		short[] numbers = new short[10];
		byte index = 0;
		boolean primeNumber;

		for (int i=101;i<299;i+=2) {
			primeNumber = true;

			for (int divider=2;divider<(i/2);divider++) {
				if (i%divider==0) {
					primeNumber = false;
					break;
				}
			}

			if (primeNumber && index<10) {
				numbers[index] = (short) i;
				index++;
			}
		}

		for (int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}