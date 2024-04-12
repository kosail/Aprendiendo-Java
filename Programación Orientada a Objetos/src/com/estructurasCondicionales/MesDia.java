package com.estructurasCondicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MesDia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingresa un número entre 1 y 365: ");
        int inputDate = Math.max(1, Math.min(365, Integer.parseInt(br.readLine())));
        String month;
        int day;
        if (inputDate <= 31) {
            month = "Enero";
            day = inputDate;
        } else {
            if (inputDate <=59) {
                month = "Febrero";
                day = inputDate - 31;
            } else {
                if (inputDate <= 90) {
                    month = "Marzo";
                    day = inputDate - 59;
                } else {
                    if (inputDate <=120) {
                        month = "Abril";
                        day = inputDate - 90;
                    } else {
                        if (inputDate <= 151) {
                            month = "Mayo";
                            day = inputDate - 120;
                        } else {
                            if (inputDate <= 181) {
                                month = "Junio";
                                day = inputDate - 151;
                            } else {
                                if (inputDate <= 212) {
                                    month = "Julio";
                                    day = inputDate - 181;
                                } else {
                                    if (inputDate <=243) {
                                        month = "Agosto";
                                        day = inputDate - 212;
                                    } else {
                                        if (inputDate <= 273) {
                                            month = "Septiembre";
                                            day = inputDate - 243;
                                        } else {
                                            if (inputDate <= 304) {
                                                month = "Octubre";
                                                day = inputDate - 273;
                                            } else {
                                                if (inputDate <= 334) {
                                                    month = "Noviembre";
                                                    day = inputDate - 304;
                                                } else {
                                                    month = "Diciembre";
                                                    day = inputDate - 334;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.printf("%d de %s\n", day, month);
        br.close();
    }
}
