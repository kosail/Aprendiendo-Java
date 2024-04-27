import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class RegistroVentas {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Farmacia> arrayStores = new ArrayList<Farmacia>();

		int optionChoosed = 4;

		do {
			System.out.println("+-----------------------------------------+");
			System.out.println("  Sistema de administración de farmacias");
			System.out.println("+-----------------------------------------+");
			System.out.println("1) Añadir información de sucursal\n2) Imprimir información de sucursales registradas\n3) Imprimir ganancias\n4) Salir");

			try {
				optionChoosed = Integer.parseInt(br.readLine());

				switch(optionChoosed) {
					case 1:
						System.out.print("Ingresa el nombre de la farmacia: ");
						String name = br.readLine();
						System.out.print("Ingresa las ventas de medicinas: ");
						double drugSales = Double.parseDouble(br.readLine());
						System.out.print("Ingresa las ventas de abarrotes: ");
						double standardSales = Double.parseDouble(br.readLine());
						System.out.print("Ingresa las ventas de fotografías: ");
						double photographSales = Double.parseDouble(br.readLine());

						arrayStores.add(new Farmacia(name, drugSales, standardSales, photographSales));
						System.out.println("Sucursal registrada exitosamente.");
						break;

					case 2:
						System.out.println("\n+----------------------------------------------+");
						System.out.println("  Información de sucursales registradas");
						System.out.println("+----------------------------------------------+\n");

						for (Farmacia store : arrayStores) {
							System.out.println(store.toString());
						}
						System.out.println();
						break;
					
					case 3:
						System.out.println("\n+----------------------------------------------+");
						System.out.println("  Sucursales con mayores ventas de fotografías");
						System.out.println("+----------------------------------------------+\n");

						for (Farmacia store : arrayStores) {
							if (store.getVentasFotografias() > store.getVentasAbarrotes()) {
								System.out.println(store.toString());
							}
						}
						System.out.println();

						System.out.println("\n+----------------------------------------------+");
						System.out.println("   Sucursales con mayores ventas de medicinas");
						System.out.println("+----------------------------------------------+\n");

						for (Farmacia store : arrayStores) {
							if (store.getVentasMedicinas() > store.getVentasAbarrotes() && store.getVentasMedicinas() > store.getVentasFotografias()) {
								System.out.println(store.toString());
							}
						}
						System.out.println();
						break;
				}

			} catch (IOException e) {
				System.err.println("Hubo un error en la lectura de la entrada del usuario. Reintenta de nuevo.");
			} catch (NumberFormatException e) {
				System.out.println("Solicitud no válida, por favor reingresa una de las opciones disponibles.");
			}
			
		} while(optionChoosed != 4);

		br.close();
	}
}
