package com.ExamenMedico;

import javax.swing.JOptionPane;

import com.Act10DesarrolloDeClasesInstanciables.Persona;

public class ExamenMedico {
    public static void main(String[] args) {
        Persona aspirante;
        String nombre;
        int contador = 0;
        double pesoPromedio = 0, alturaPromedio = 0;

        while ((nombre = JOptionPane.showInputDialog("Ingresa el nombre de estudiante:")).length() > 0) {
            aspirante = new Persona(nombre,
            Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad:")),
            Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso en KG:")),
            Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura en metros:")));

            if (aspirante.getEdad() >= 18) {
                contador++;
                pesoPromedio += aspirante.getPeso();
                alturaPromedio += aspirante.getAltura();
            }

            JOptionPane.showMessageDialog(null, aspirante.toString() + "\n" + "IMC: " + aspirante.calcularIMC());
        }

        if (contador > 0) {
            JOptionPane.showMessageDialog(null, String.format("Peso promedio de los aspirante mayores de edad: %.2f", pesoPromedio/contador));
            JOptionPane.showMessageDialog(null, String.format("Altura promedio de los aspirante mayores de edad: %.2f", alturaPromedio/contador));
        }
    }
}
