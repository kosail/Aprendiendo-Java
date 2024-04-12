package com.CuentaBanco;

import javax.swing.JOptionPane;

public class MovimientosCuenta{
    public static void main(String[] args) {
        Cuenta cuenta;
        int num, op;
        String tit;
        double sal, cant;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de cuenta: "));

        tit = JOptionPane.showInputDialog(null, "Titular: ");
        sal = Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo inicial: "));

        
        cuenta = new Cuenta(num, tit, sal);
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "0)Terminar\n1)Depositar\n2)Retirar\n3)Consultar saldo"));

        while (op > 0 && op <= 3){
            switch (op){
                case 1:
                    cant = Double.parseDouble(JOptionPane.showInputDialog(null, "Cantidad a depositar: "));
                    cuenta.depositar(cant);
                    break;

                case 2:
                    cant = Double.parseDouble(JOptionPane.showInputDialog(null, "Cantidad a retirar: "));
                    cuenta.retirar(cant);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, cuenta.toString());
                    break;
            }
            
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "0)Terminar\n1)Depositar\n2)Retirar\n3)Consultar saldo"));
        }
    }
}