// Cargar un vector de 8 posiciones con los 8 primeros elementos de la serie de Fibonacci y mostrarlo en pantalla.
 

public class DFPS_FPU4Prob4 {
	public static void main(String[] args) {
		int[] numbers = new int[8];
		int a=0, b=1;

		for (int i=0;i<numbers.length;i++) {
			numbers[i] = a + b;
			a = b;
			b = numbers[i];
		}

		for (int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
}
