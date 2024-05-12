/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDos;

/**
 *
 * @author Usuario iTC
 */
public class Calificaciones {
    private String nombre;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;
    
    public Calificaciones(String n, double c1, double c2){
        nombre = n;
        materia1 = c1;
        materia2 = c2;
        materia3 = (materia1 + materia2)/2;
                
    }
    public Calificaciones(String n, double c1, double c2, double c3){
        nombre = n;
        materia1 = c1;
        materia2 = c2;
        materia3 = c3;
                
    }
    
    public void establecerNombre (String n){
        nombre = n;
    }
    
    public void establecerCalificacion1 (double x){
        materia1 = x;
    }
    
    public void establecerCalificacion2 (double x){
        materia2 = x;
    }
    
    public void establecerCalificacion3 (double x){
        materia3 = x;
    }
    
    public void calcularPromedio (){
        promedio = (materia1 + materia2 + materia3)/3;
    }
    
    public String obtenerNombre (){
        return nombre;
    }
    
    public double obtenerCalificacion1 (){
        return materia1;
    }
    
    public double obtenerCalificacion2 (){
        return materia2;
    }
    
    public double obtenerCalificacion3 (){
        return materia3;
    }
    
    public double obtenerPromedio (){
        return promedio;
    }
    
    public String toString (){
        String cadena = String.format ("\nNombre del estudiante: %s\n"
                + "Calificación materia 1: %.2f\n"
                + "Calificación materia 2: %.2f\n"
                + "Calificación materia 3: %.2f\n"
                + "Promedio de calificaciones: %.2f\n",
                nombre,
                materia1,
                materia2,
                materia3,
                promedio);
        return cadena;
    }
    
    
    
    
}
