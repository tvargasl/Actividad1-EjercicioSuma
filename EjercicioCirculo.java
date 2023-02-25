package com.mycompany.ejerciciocirculo;

import java.util.Scanner;

public class EjercicioCirculo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo:");
        float radio = entrada.nextFloat();
        
        double area = Math.PI * (radio*radio);
        double longitud = Math.PI * 2 * radio;
        
        System.out.println("El area del circulo es: "+area+" y la longitud de su circunferencia es: "+longitud);
    }
}
