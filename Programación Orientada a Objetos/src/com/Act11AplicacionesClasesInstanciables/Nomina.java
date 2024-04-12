package com.Act11AplicacionesClasesInstanciables;

import javax.swing.JOptionPane;
import com.Act10DesarrolloDeClasesInstanciables.Empleado;

public class Nomina {
    public static void main(String[] args) {
        int empleadoID = 0;
        double totalSalarios = 0;

        Empleado empleado = new Empleado(0, "null", 0, 0);
        StringBuilder sb = new StringBuilder(String.format("Compañía Schnee:\n%-10s %-20s %-10s%n", "Num.", "Nombre", "Sueldo"));

        do {
            String tempInput = JOptionPane.showInputDialog("Ingresa número de empleado:");

            if (tempInput.equals("")) {
                empleadoID = 0;
            } else {
                empleadoID = Integer.parseInt(tempInput);
            }

            if (empleadoID > 0) {
                empleado.setNombre(JOptionPane.showInputDialog("Ingresa el nombre del empleado:"));
                empleado.setNumero(empleadoID);
                empleado.setHorasTrabajadas(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de horas trabajadas:")));
                empleado.setPagoHora(Double.parseDouble(JOptionPane.showInputDialog("Ingresa cantidad a pagar por hora:")));

                totalSalarios += empleado.calcularSalario();

                sb.append(String.format("%-10d %-30s $%-9.2f%n", empleado.getNumero(), empleado.getNombre(), empleado.calcularSalario()));

            }
        } while(empleadoID > 0);

        sb.append("--------------------------\n");
        sb.append(String.format("Total a pagar: $%.2f", totalSalarios));
        JOptionPane.showMessageDialog(null, sb);

    }
}
