package unidad2;

// Se requiere determinar cuánto dinero ahorra una persona en un año si considera que cada semana ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el sueldo).
import javax.swing.JOptionPane;

public class FPU2Prob25_DFPS {
    public static void main(String[] args) {
        float salaryPerWeek=0, savedMoney=0;
        
        salaryPerWeek = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu salario semanal:"));

        savedMoney = 12*(4*(salaryPerWeek*0.15F));
        
        JOptionPane.showMessageDialog(null, "Si ahorraras el 15% de tu salario semanal durante 1 año, tendrás la cantidad aproximada de $" + Math.round(savedMoney));
    }
}
