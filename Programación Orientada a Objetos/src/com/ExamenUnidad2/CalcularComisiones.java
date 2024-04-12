package com.ExamenUnidad2;

import javax.swing.JOptionPane;

public class CalcularComisiones {
    public static void main(String[] args) {
        int actualSeller;
        double totalCommissions = 0;
        
        String temp = "";
        StringBuilder results = new StringBuilder("Nombre:      Comisión:\n");
        
        do {
            temp = JOptionPane.showInputDialog("Ingrese número de vendedor: ");
            actualSeller = temp.equals("") ? -1 : Integer.parseInt(temp);

            if (actualSeller != -1) {
                Vendedor seller = new Vendedor(
                    actualSeller,
                    JOptionPane.showInputDialog("Ingrese el nombre del vendedor: "),
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de ventas: ")));
    
                    results.append(String.format("%s     %-.2f\n", seller.getNombre(), seller.calcularComision()));
                    totalCommissions += seller.calcularComision();
            }
            
        } while (actualSeller != -1);

        results.append(String.format("\nTotal a pagar en comisiones: %.2f", totalCommissions));
        JOptionPane.showMessageDialog(null, results);
    }
}
