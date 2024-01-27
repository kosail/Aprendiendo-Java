// Leer dos matrices de 4x5 enteras y determinar si la suma de los múltiplos de 5 de una de las matrices es mayor a la suma de los múltiplos de 5 de la otra matriz.
 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DFPS_FPU4Prob75 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] table1 = new int[4][5], table2 = new int[4][5];
		int sumTable1=0, sumTable2=0;

		System.out.println("Ingresa 20 números, uno a la vez: ");
		for (int i=0;i<table1.length;i++) {
			for (int j=0;j<table1[i].length;j++) {
				table1[i][j] = Integer.parseInt(br.readLine());

				if (table1[i][j]==0) {
					sumTable1+=table1[i][j];
				}
			}
		}

		System.out.println("Ingresa otros 20 números, uno a la vez: ");
		for (int i=0;i<table2.length;i++) {
			for (int j=0;j<table2[i].length;j++) {
				table2[i][j] = Integer.parseInt(br.readLine());

				if (table2[i][j]%5==0) {
					sumTable2+=table2[i][j];
				}
			}
		}

		if (sumTable1>sumTable2) {
			System.out.println("La suma de la tabla 1 es mayor que la tabla 2.");
		} else {
			System.out.println("La suma de la tabla 2 es mayor que la tabla 1.");
		}


		br.close();
	}
}
