/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteUno;

import java.util.Scanner;

import paqueteDos.Calificaciones;
/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        String nombre;
        double calificacion1, calificacion2, calificacion3 = 0; 
        int seleccion;
        
        do{
            System.out.println(
                      "Opcion 1: Ingresar nombre, calificacion materia"
                    + "1 y calificacion materia 2\n"
                    + "Opcion 2: Ingresar nombre, calificacion materia 1, "
                    + "calificacion materia 2, y calificacion materia 3\n\n"
                    + "Ingrese el numero de la acción que desea realizar: ");
            seleccion = sc.nextInt();
            sc.nextLine();
            
            if(seleccion != 1 && seleccion != 2){
                System.out.println("OPCION NO VALIDA\n");
            }
            
        }while (seleccion != 1 && seleccion != 2);
        
        System.out.println("\nIngrese el nombre del estudiante: ");
        

        nombre = sc.nextLine();
        
        
   
        System.out.println("\nIngrese la calificación de la materia 1: ");
        calificacion1 = sc.nextInt();
        
        System.out.println("\nIngrese la calificación de la materia 2: ");
        calificacion2 = sc.nextInt();
        
        if (seleccion == 2){
            System.out.println("\nIngrese la calificación de la materia 3: ");
        calificacion3 = sc.nextInt();
        }
        
        if (seleccion == 1 ){
            
            Calificaciones estudiante = new Calificaciones(nombre, 
                    calificacion1, calificacion2);
            estudiante.calcularPromedio();
            System.out.printf("%s",estudiante);
        }
        
        if (seleccion == 2 ){
            
            Calificaciones estudiante = new Calificaciones(nombre, 
                    calificacion1, calificacion2, calificacion3);
            estudiante.calcularPromedio();
            System.out.printf("%s",estudiante);
        }
        
        
        
        
    }
    
}
