package com.mycompany.ejerciciosalario;

import java.util.Scanner;
       
public class EjercicioSalario {

    public static void main(String[] args) {
        double horas,valorhora, porcentaje, bruto, neto, retencion;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese las horas trabajadas en la semana: ");
        horas = entrada.nextDouble();
        
        System.out.println("Ingrese los ingresos por hora trabajada: ");
        valorhora= entrada.nextDouble();
        
        porcentaje = 0.125;
        bruto = horas*valorhora;
        retencion = bruto * porcentaje;
        neto = bruto - retencion;
        
        System.out.println("El salario bruto es: "+ bruto);
        System.out.println("La retencion en la fuente es: "+ retencion);
        System.out.println("El salario nrto es: "+ neto);
        
        
        
        
        System.out.println("El salario bruto del trabajador es: "+bruto+", la retencion en la fuente es: "+retencion+" y el salaio neto es: "+neto);
         
                
    }
}
