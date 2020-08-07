package ar.com.ada.online.second.exercisesevenbis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // titulo el programa y declarar las variables
        System.out.println("Programa para determinar la asignación de becas mensuales");
        System.out.println("*********************************************************");
        // identar codigo ctrl + alt + l
        int age;
        double note;
        int scholarship = 0; //beca
        String msg;

        //metodo para ingresar datos con teclado

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese la edad:");
        age = keyboard.nextInt();
        System.out.println("Ingrese la nota:");
        note = keyboard.nextDouble();

        //estructura de control

        if (age > 18) {
            if (note <= 6) {

                msg = "Una carta de invitacion para que estudien mas el proximo año";
                System.out.println("Enviar" + msg);

            } else if (note <= 7.5) {
                scholarship = 500;
            } else if (note <= 9) {
                scholarship = 1000;
            } else if (note <= 10) {
                scholarship = 2000;

            }

        } else {
            if (note <= 6) {
                msg = "Recibira Una carta de invitacion para que estudien mas el proximo año";
                System.out.println("Enviar:" + msg);

            } else if (note <= 8) {
                scholarship = 100;
            } else if (note <= 9) {
                scholarship = 2000;
            } else if (note <= 10) {
                scholarship = 3000;
            }


        }
        System.out.println("la beca es de:" + scholarship);


    }
}
