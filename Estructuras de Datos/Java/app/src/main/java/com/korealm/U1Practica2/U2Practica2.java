package com.korealm.U1Practica2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class U2Practica2 {
    
    static void showAllMeals(String[][] meals) {
        System.out.println("╭━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╮");
        System.out.println("┃              ~ Todas las comidas ~            ┃");
        System.out.println("╰━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╯");
        
        for (String[] row : meals) {
            for (String meal : row) {
                System.out.print(meal + "       ");
            }
            System.out.println();
        }
        
    }
    
    static void showAllWeeksLunch(String[][] meals) {
        System.out.println("Almuerzos de la semana:");
        
        for (int i = 0; i < meals[1].length; i++) {
            System.out.printf(
                    "\tLa comida del día %s: %s\n",
                    getDayOfWeek(i),
                    meals[1][i]
            );
        }
    }
    
    static void showMealsPerDay(String[][] meals) {
        for (int j = 0; j < meals[0].length; j++) {
            System.out.printf("Las comidas del %s son:\n", getDayOfWeek(j));
            System.out.printf("\tEl desayuno: %s\n\tLa comida: %s\n\tLa cena: %s\n\n", meals[0][j], meals[1][j], meals[2][j]);
        }
        
    }
    
    static void showMealsForSelectedDay(String[][] meals, int day) {
        System.out.printf("┃ Las comidas correspondientes al %s son:\n", getDayOfWeek(day));
        
        if (day < 0 || day > 6) throw new IllegalArgumentException("┃ Día inválido. Debes de ingresar de 0 a 6, que corresponde de lunes a domingo respectivamente.");
        
        for (String[] week : meals) {
            System.out.println(week[day]);
        }
    }
    
    static void printMenu() {
        System.out.println("╭━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╮");
        System.out.println("┃                ~ Central Dietética ~             ┃");
        System.out.println("┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃");
        System.out.println("┃          1. Mostrar tabla de alimentos           ┃");
        System.out.println("┃          2. Almuerzos de toda la semana          ┃");
        System.out.println("┃          3. Alimentos agrupados por día          ┃");
        System.out.println("┃   4. Mostrar alimentos de un día en particular   ┃");
        System.out.println("┃                     5. Terminar                  ┃");
        System.out.println("╰━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╯");
        System.out.print("\n>> ");
    }
    
    private static String getDayOfWeek(int dayIndex) {
        return switch (dayIndex) {
            case 0 -> "Domingo";
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            default -> throw new IllegalArgumentException("Día de la semana inválido.");
        };
    }
    
    public static void main(String[] args) {
        String[][] meals = {
                {"Avena", "Cereal", "Huevo", "Yogur", "Fruta", "Pan tostado", "Hotcakes"},
                {"Pollo", "Sándwich", "Verduras", "Atún", "Bistec", "Champiñones", "Espagueti"},
                {"Frijoles",  "Quesadillas", "Estofado", "Picadillo", "Lasaña", "Ensalada", "Pizza"}
        };
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        
        while (true) {
            try {
                printMenu();
                option = Integer.parseInt(br.readLine());
                
                if (option == 5) break;
                
                switch (option) {
                    case 1 -> showAllMeals(meals);
                    case 2 -> showAllWeeksLunch(meals);
                    case 3 -> showMealsPerDay(meals);
                    case 4 -> {
                        System.out.print("┃ ¿Qué día de la semana?\n┃ Ingresa el índice del día:\n\t0) Domingo 1) Lunes\t2) Martes\t3) Miércoles\t4) Jueves\t5) Viernes\t6) Sábado\n\n>> ");
                        int day = Integer.parseInt(br.readLine());
                        showMealsForSelectedDay(meals, day);
                    }
                }
            } catch (IOException | NumberFormatException e) {
                System.err.println("Ha ocurrido un error procesando la información. Por favor, revisa la entrada y vuelve a intentarlo de nuevo.\n");
            } catch (IllegalArgumentException e) {
                System.err.println("Ingresaste una opción no válida");
            }
        }
        
        System.out.println("¡Sigue la dieta!");
    }
}
