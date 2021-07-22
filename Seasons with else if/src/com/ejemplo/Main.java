package com.ejemplo;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        var mes = 0;
        var estacion = "Estacion desconocida";

        System.out.println("Ingrese el numero del mes para saber la estacion : ");
        Scanner entrada = new Scanner(System.in);
        mes = entrada.nextInt();

        if (mes == 12 || mes == 1 || mes == 2) {
            estacion = "Verano";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Otonio";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Invierno";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = " Primavera ";
        }
        System.out.println(" La estacion es " + estacion);
    }

}

