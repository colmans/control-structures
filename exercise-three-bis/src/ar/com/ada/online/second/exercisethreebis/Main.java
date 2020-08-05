package ar.com.ada.online.second.exercisethreebis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // titulo el programa y declaro las variables
        //recordar ordenar el codigo crtl + alt + l

        System.out.println("Programa para determinar qué regalo se \n" +
                "puede comprar segun el presupuesto");
        System.out.println("******************************************");
        double budget; //presupuesto


        //metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el presupuesto:");
        budget = keyboard.nextDouble();

        //estructura de control
        if (budget <= 10) {
            System.out.println("Puede regalar: una tarjeta");
        } else if (budget <= 100) {
            System.out.println("Puede regalar: un chocolate");
        } else if (budget <= 250) {
            System.out.println("Puede regalar: flores");
        } else {
            System.out.println("Puede regalar: un anillo");
        }
    }
}