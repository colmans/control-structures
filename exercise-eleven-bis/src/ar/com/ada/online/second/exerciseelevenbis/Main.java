package ar.com.ada.online.second.exerciseelevenbis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // titulo el programa y declaro las variables
        // identar el codigo CTRL + ALT + L

        System.out.println("Programa para determinar el bono que recibirá un\n" +
                "trabajador");
        System.out.println("***************************************************");

        int yearOfEmployment; // antiguedad laboral
        double laborBonus = 0;

        //metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese antiguedad laboral: ");
        yearOfEmployment = keyboard.nextInt();

        if (yearOfEmployment > 5) {
            laborBonus = 1000;
            // System.out.println("El bono es de:" + laborBonus);
        } else {
            switch (yearOfEmployment) {
                case 5:
                    laborBonus = 500;
                    break;
                case 4:
                    laborBonus = 400;
                    break;
                case 3:
                    laborBonus = 300;
                    break;
                case 2:
                    laborBonus = 200;
                    break;
                case 1:
                    laborBonus = 100;
                    break;
                default:
                    System.out.println("No cumplio el año de antiguedad");


            }

        }
        System.out.printf("El bono a percibir es:\n  %5.2f", laborBonus);
    }
}

