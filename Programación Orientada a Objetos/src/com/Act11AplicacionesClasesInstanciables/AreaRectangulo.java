package com.Act11AplicacionesClasesInstanciables;

import javax.swing.JOptionPane;

public class AreaRectangulo {
    public static void main(String[] args) {
        double[] lados = new double[2];

        lados[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura:"));
        lados[1] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base o el ancho"));

        boolean esCuadrado = lados[0] == lados[1];

        if (esCuadrado) {
            double areaCirculo = Math.PI * Math.pow(lados[0]/2, 2);
            double areaCuadrado = lados[0] * lados[1]; 

            JOptionPane.showMessageDialog(null, String.format("Área del círculo circunscrito: %.2f", areaCuadrado - areaCirculo));
        } else {
            JOptionPane.showMessageDialog(null, String.format("Área: %.2f\nPerímetro: %.2f", lados[0] * lados[1], 2*lados[0] + 2*lados[1]));
        }
    }
}
