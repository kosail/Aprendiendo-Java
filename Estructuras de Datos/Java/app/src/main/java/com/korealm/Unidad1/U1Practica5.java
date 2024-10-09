package com.korealm.Unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class U1Practica5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingresa una oración: ");
        String[] temp = br.readLine().split(" ");
        
        char[][] mc1 = new char[temp.length][];
        char[][] mc2 = new char[temp.length][];
        
        for (int i = 0; i < temp.length; i++) {
            char[] chars = temp[i].toCharArray();
            mc1[i] = Arrays.copyOf(chars, chars.length);
            
            Arrays.sort(chars);
            mc2[i] = chars;
        }
        
        
        // Printing
        for (int i = 0; i < mc2.length; i++) {
            System.out.printf("%d %s\n", i, Arrays.toString(mc1[i]));
        }
        
        System.out.println();
        
        for (int i = 0; i < mc2.length; i++) {
            System.out.printf("%d %s\n", i, Arrays. toString(mc2[i]));
        }
    }
}
