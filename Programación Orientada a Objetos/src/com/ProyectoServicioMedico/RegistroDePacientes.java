package com.ProyectoServicioMedico;

import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class RegistroDePacientes {
    public static void main(String[] args)  throws IOException{
        //Salida Dat (objetos)
        File fileDat = new File("Pacientes.dat");
        FileOutputStream fdsDat = new FileOutputStream(fileDat);
        ObjectOutputStream salidaDat = new ObjectOutputStream(fdsDat);
        
        //Salida Text
        File fileText = new File("Pacientes.txt");
        FileOutputStream fdsText = new FileOutputStream(fileText);
        PrintWriter salidaText = new PrintWriter(fdsText);
        
        //Datos
        int exp, ed;
        String nom, cel;
        double pe,al;
        
        //Array de pacientes
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        //Solicitar pacientes
        exp = Integer.parseInt(JOptionPane.showInputDialog(null, "NUEVO PACIENTE\n\nExpediente:"));
        while (exp>0){
            nom = JOptionPane.showInputDialog(null, "Nombre:");
            cel = JOptionPane.showInputDialog(null, "Celular:");
            ed = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:"));
            pe = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso:"));
            al = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura (m):"));
            //Añade el paciente
            pacientes.add(new Paciente(exp, nom, cel, ed, pe, al));
            exp = Integer.parseInt(JOptionPane.showInputDialog(null, "NUEVA PERSONA\n\n(Ingrese 0 para terminar)\n\nExpediente:"));
        }

        //Salida dat
        salidaDat.writeObject(pacientes);

        //Salida text
        for (int i = 0; i < pacientes.size(); i++) {
            salidaText.println(pacientes.get(i).toString());}

        JOptionPane.showMessageDialog(null, "Archivos guardados");
        salidaDat.close();
        salidaText.close();
    }
}
