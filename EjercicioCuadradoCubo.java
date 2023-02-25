package com.mycompany.ejerciciocuadradocubo;

import java.util.Scanner;

public class EjercicioCuadradoCubo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para obener su cuadrado y su cubo:");
        
        float x = entrada.nextFloat();
        
        System.out.println("El cuadrado de "+x+" es: "+Math.pow(x,2));
        System.out.println("El cubo de "+x+" es: "+Math.pow(x,3));

        
    }
}
