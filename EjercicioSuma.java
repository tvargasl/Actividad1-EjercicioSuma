package com.mycompany.ejerciciosuma;

public class EjercicioSuma {

    public static void main(String[] args) {
        
        int suma = 0;
        int x = 20;
        
        suma = suma + x;
        
        int y = 40;
        
        x = x + y*y;
        suma = suma + x/y;
        
        System.out.println("EL VALOR DE LA SUMA ES:" + suma);
        
        
    }
}
