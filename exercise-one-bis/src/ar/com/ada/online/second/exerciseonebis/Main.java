package ar.com.ada.online.second.exerciseonebis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declaro las variables y titulo el programa

        System.out.println("Programa para determinar si una persona puede votar con base en su edad\n" +
                "en las próximas elecciones");

        int age;
        String result;

        //metodo para ingresar datos por keyboard
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese edad:");
        age = keyboard.nextInt();

        //estructura de control

        if (age >= 18) {
            //resultado true
            result = "Puede Votar";

        } else {
            //resultado false
            result = "No puede votar";

        }

        System.out.println("La persona:" + result);


    }
}
