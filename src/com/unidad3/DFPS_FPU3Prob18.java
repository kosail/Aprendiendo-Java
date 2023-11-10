// Leer dos números enteros y mostrar todos los múltiplos de 5 comprendidos entre el menor y el mayor.
package unidad3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DFPS_FPU3Prob18 {
    public static void main(String[] args) throws java.io.IOException {
    int num1=0, num2=0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Ingresa dos números, uno a la vez: ");
    num1 = Integer.parseInt(br.readLine());
    num2 = Integer.parseInt(br.readLine());

    if (num2>num1) {
        for (int i=num1;i<=num2;i++) {
            if (i%5==0) {
                System.out.print(i + " ");
            }
        }
    } else {
        for (int i=num2;i<=num1;i++) {
            if (i%5==0) {
                System.out.print(i + " ");
            }
        }
    }
    System.out.println("");
    br.close();
    }
}