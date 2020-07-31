package ar.com.ada.online.second.exerciseone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int mayor;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese primer numero:");
        numberOne = keyboard.nextInt();
        System.out.println("Ingrese segundo numero:");
        numberTwo = keyboard.nextInt();

        if (numberOne > numberTwo) {
            //resultado true
            mayor = numberOne;
        } else {
            //resultado false
            mayor = numberTwo;
        }

        System.out.println("el numero mayor es:" + mayor);
    }


}

