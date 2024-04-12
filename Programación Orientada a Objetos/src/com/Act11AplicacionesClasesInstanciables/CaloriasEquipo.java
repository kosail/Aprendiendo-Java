package com.Act11AplicacionesClasesInstanciables;

import javax.swing.JOptionPane;
import com.Act10DesarrolloDeClasesInstanciables.Persona;

public class CaloriasEquipo {
    public static void main(String[] args) {
        Persona[] jugadores = new Persona[20];
        double[] caloriasPorJugador = new double[jugadores.length];
        int promedioCalorias = 0;
        
        for (int i=0;i<jugadores.length;i++) {
            // Creando un objeto de tipo persona en cada vuelta de ciclo y guardándolo en el array de jugadores.
            jugadores[i] = new Persona(
            JOptionPane.showInputDialog(null, String.format("Ingresa el nombre del jugador %d:", i + 1)),
            Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad:")),
            Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso:")),
            Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura:"))
            );

            // Aprovechando el mismo ciclo para calcular las calorias del jugador recién creado y almacenarlo en el array caloriasPorJugador
            caloriasPorJugador[i] = jugadores[i].calcularCalorías();
            promedioCalorias+=caloriasPorJugador[i];
        }

        System.out.println("+---- Calorias por Jugador ----+");
        for (int i=0; i<caloriasPorJugador.length; i++) {
            System.out.printf("Jugador %d: %.2f\n", i, caloriasPorJugador[i]);
        }
        System.out.println("+------------------------------+");
        System.out.println("Promedio de calorias: " + promedioCalorias/caloriasPorJugador.length);
    }
}
