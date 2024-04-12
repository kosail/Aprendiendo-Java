package com.Actividad17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class CatalogoDeArticulos {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Articulo> stock = new ArrayList<Articulo>();
        int menuOptionSelected = -1;

        do {
            System.out.printf("+-----------------------------------+\n");
            System.out.printf("\033[36m%30s%n\033[0m", "Aplicación de inventario");
            System.out.printf("+-----------------------------------+\n");
            System.out.printf("0) Salir\n1) Altas\n2) Bajas\n3) Catálogo de artículos\n\n");
            System.out.printf("%30s%n", "-----------------------");
            System.out.print(">> ");

            try {
                menuOptionSelected = Integer.parseInt(br.readLine());

                if (menuOptionSelected > 0 && menuOptionSelected < 3) {
                    System.out.print("Clave del artículo: ");
                    int itemKey = Integer.parseInt(br.readLine());
                    Articulo itemInStock = itemInStockChecker(stock, itemKey);

                    if (menuOptionSelected == 1) {
                        if (itemInStock != null) {
                            System.err.printf("\033[31mEl artículo no fue añadido porque ya existe.\033[0m\n");
                            Thread.sleep(1500);
                            clearTerminal();
                            continue;
                        }

                        System.out.print("Descripción del artículo: ");
                        String description = br.readLine();
                
                        System.out.print("Número de unidades en existencia: ");
                        int unitsInStock = Integer.parseInt(br.readLine());
                
                        System.out.print("Costo por unidad: ");
                        double costPerUnit = Double.parseDouble(br.readLine());
                
                        stock.add(new Articulo(itemKey, description, unitsInStock, costPerUnit));
                        System.out.printf("\033[32mArtículo añadido existosamente.\033[0m\n");
                    }

                    if (menuOptionSelected == 2) {
                        if (itemInStock == null) {
                            System.err.printf("\033[31mNo existe ningún artículo con clave: %d\033[0m\n", itemKey);
                            Thread.sleep(1500);
                            clearTerminal();
                            continue;
                        }

                        stock.remove(itemInStock);
                        System.out.printf("\033[32mArtículo eliminado existosamente.\033[0m\n");
                    }
                }

                if (menuOptionSelected == 3) {
                    double stockTotalValue = 0;

                    System.out.printf("%-15s %-20s %-20s %s\n", "Clave", "Descripción", "Existencia", "Costo", "Valor del Inventario");
                    System.out.printf("---------------------------------------------------------------\n");

                    for (Articulo a : stock) {
                        System.out.printf("%-20d %-20s %-20d %.2f\n", a.getClave(), a.getDescripcion(), a.getExistencia(), a.getCosto(), a.calcularValorInventario());

                        stockTotalValue += a.calcularValorInventario();
                    }

                    System.out.printf("%30s%n", "-----------------------");
                    System.out.printf("Valor total del inventario: %.2f\n\n", stockTotalValue);
                }

                
            } catch (NumberFormatException e) {
                System.err.println("Solicitud inválida, ingresa una de las opciones disponibles.");
            }

        } while(menuOptionSelected != 0);
            
        System.out.println("Gracias por usar nuestro sistema de inventarios.\n¡Nos vemos pronto!");
    }


    private static Articulo itemInStockChecker(ArrayList<Articulo> stock, int itemKey) {
        for (Articulo a : stock) {
            if (a.getClave() == itemKey) {
                return a;
            }
        }

        return null;
    }

    public static void clearTerminal() { // Method to clear the terminal and flush the buffer
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
