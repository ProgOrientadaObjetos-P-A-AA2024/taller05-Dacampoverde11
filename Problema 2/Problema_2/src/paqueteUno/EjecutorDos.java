package paqueteUno;

import java.util.Scanner;

import paqueteDos.Vehiculos;

/**
 *
 * @author Usuario iTC
 */
public class EjecutorDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anio;
        String seleccion, cedula, marca, cadenaFinal = "";
        double valorVehiculo;
        boolean estado = true;
        while (estado) {
            System.out.println("\nIngrese la cedula del propietario: ");
            cedula = sc.nextLine();

            System.out.println("\nIngrese la marca del vehiculo");
            marca = sc.nextLine();

            System.out.println("\nIngrese el año del vehiculo: ");
            anio = sc.nextInt();

            System.out.println("\nIngrese el valor del vehiculo:");
            valorVehiculo = sc.nextDouble();
            sc.nextLine();

            Vehiculos v1 = new Vehiculos(cedula, marca, anio, valorVehiculo);
            v1.calcularValorMatricula();
            cadenaFinal = cadenaFinal + String.format("%s\n", v1);

            System.out.println("\n¿Desea ingresar mas vehiculos? (Ingrese n "
                    + "para salir)");
            seleccion = sc.nextLine();

            if (seleccion.equals("n")) {
                estado = false;
            }

        }
        System.out.println(cadenaFinal);

    }

}
