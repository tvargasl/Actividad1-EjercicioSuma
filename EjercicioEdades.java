package com.mycompany.ejercicioedades;

import java.util.Scanner;

public class EjercicioEdades {

    public static void main(String[] args) {

        System.out.println("Queremos saber la edad de la mamá de Juan en base a la edad de sus tres hijos");
        
        int juan,alberto,ana,madre;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la edad de Juan:");
        juan = entrada.nextInt();
        alberto = (juan*2)/3;
        ana = (juan*4)/3;
        madre = juan+alberto+ana;
        System.out.println("Entonces como la edad de Juan es "+juan+", la edad de alberto es "+alberto+", la edad de ana es "+ana+" y como la edad de la madre es la suma de los tres, pues su edad es: "+madre);
        

    }
}
