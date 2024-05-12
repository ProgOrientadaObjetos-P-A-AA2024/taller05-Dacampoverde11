/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDos;

/**
 *
 * @author Usuario iTC
 */
public class Vehiculos {
    
    private String cedula;
    private String marca;
    private int anioFab;
    private double valorVehiculo;
    private double valorMatricula;
    
   
    
    public Vehiculos (String c, String m, int af, double v){
        cedula = c;
        marca = m;
        anioFab = af;
        valorVehiculo = v;
        
    }
    
    
    public void establecerCedula (String n){
        cedula = n;
    }
    
    public void establecerMarca (String n){
        marca = n;
    }
    
    
    public void establecerAnio(int n){
        anioFab = n;
    }
    
    public void establecerValorVehiculo (double n){
        valorVehiculo = n;
    }
    
    public void calcularValorMatricula (){
        valorMatricula = (valorVehiculo*(0.002/100))* (2024-anioFab);
    }
    
    public String obtenerCedula (){
        return cedula;
    }
    
    public String obtenerMarca (){
        return marca;
    }
    
    public int obtenerAnio(){
        return anioFab;
    }
    
    public double obtenerValorVehiculo(){
        return valorVehiculo;
    }
    
    public double obtenerValorMatricula(){
        return valorMatricula;
    }
    
    public String toString (){
        String cadena = String.format("\nCédula del dueño: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor matricula: %.2f\n"
                + "Valor final: %.2f\n",
                cedula,
                marca,
                anioFab,
                valorVehiculo,
                valorMatricula,
                valorVehiculo+valorMatricula); 
        return cadena;
    }
    
}