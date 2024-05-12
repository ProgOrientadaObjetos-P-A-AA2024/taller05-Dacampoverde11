/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteUno;

import java.util.Scanner;

import paqueteDos.Vehiculos;
/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int num, anio;
        String cedula, marca, cadenaFinal = "";
        double valorVehiculo;
         System.out.println("Ingrese el numero de vehiculos que va a ingresar: ");
         num = sc.nextInt();
         sc.nextLine();
         for (int c = 0; c<num; c++){
             System.out.println("\nIngrese la cedula del propietario: ");
             cedula = sc.nextLine();
             
             System.out.println("\nIngrese la marca del vehiculo");
             marca = sc.nextLine();
             
             
             System.out.println("\nIngrese el año del vehiculo: ");
             anio = sc.nextInt();
             
             System.out.println("\nIngrese el valor del vehiculo:");
             valorVehiculo = sc.nextDouble();
             sc.nextLine();
             
             Vehiculos v1 = new Vehiculos (cedula, marca, anio, valorVehiculo);
             v1.calcularValorMatricula();
             cadenaFinal = cadenaFinal +String.format("%s\n",v1);
             
             
             
         }
         System.out.println(cadenaFinal);
        
    }
    
}
