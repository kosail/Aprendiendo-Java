package com.Act11AplicacionesClasesInstanciables;

import javax.swing.JOptionPane;

import com.Act10DesarrolloDeClasesInstanciables.Profesor;

public class TotalDeHoras {
    public static void main(String[] args) {
        double totalHoras = 0, totalAPagar = 0;
        Profesor profesor = new Profesor(0, "null", 0, 0);
        Profesor profesorConMasHoras = profesor;

        do {
            String tempExpediente = "";
            tempExpediente = JOptionPane.showInputDialog("Ingresa el número de experiente:");
            
            if (! tempExpediente.equals("")) {
                profesor.setExpediente(Integer.parseInt(tempExpediente));
            } else {
                profesor.setExpediente(0);
            }

            if (profesor.getExpediente() > 0) {
                profesor.setNombre(JOptionPane.showInputDialog("Ingresa el nombre:"));
                profesor.setHoras(Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de horas:")));
                profesor.setCategoria(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la categoría:")));
            }

            totalHoras += profesor.getHoras();
            totalAPagar += profesor.calcularSalario();

            if (profesorConMasHoras.getHoras() < profesor.getHoras()) {
                profesorConMasHoras = profesor;
            }
        } while (profesor.getExpediente() > 0);

        JOptionPane.showMessageDialog(null, String.format("Total de horas: %.2f\nTotal a pagar: %.2f\n\nProfesor con más horas: %s\n", totalHoras, totalAPagar, profesorConMasHoras.toString()));


    }
}
