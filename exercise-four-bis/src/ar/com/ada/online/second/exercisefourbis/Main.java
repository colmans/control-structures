package ar.com.ada.online.second.exercisefourbis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // tiutlo el programa y declaro las variables

        System.out.println("Programa para determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes");
        System.out.println("*****************************************************************************************");

        double parkingValue;
        double hours;

        //metodo para pedir datos por teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese horas de estacionamiento:");
        hours = keyboard.nextDouble();

        //estructura de control

        if (hours <= 2) {
            parkingValue = hours * 5;

        } else if (hours <= 5) {
            parkingValue = (hours - 2) * 4 + 10;

        } else if (hours <= 10) {
            parkingValue = (hours - 5) * 3 + 22;

        } else {
            parkingValue = (hours - 10) * 2 + 37;
        }
        System.out.println("El valor del estacionamiento es: " + parkingValue);
    }
}