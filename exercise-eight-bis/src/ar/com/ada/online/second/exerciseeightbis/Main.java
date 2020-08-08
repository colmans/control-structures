package ar.com.ada.online.second.exerciseeightbis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // titulo el programa y declaro las variables
        // identar el codigo ctrl + alt + l

        System.out.println("Programa para determinar cual es el Bono de mayor valor");
        System.out.println("*******************************************************");

        double laborOld = 0;
        double salary;
        double bondForYear = 0; //bonoporantiguedad
        double bondForSalary = 0; //bono por salario
        double mayorBono;

        // metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese salario:");
        salary = keyboard.nextDouble();
        System.out.println("Ingrese antiguedad laboral:");
        laborOld = keyboard.nextDouble();

        //estructura de control IF ELSE IF

        if (laborOld >= 5) {
            bondForYear = salary * 0.30;
        } else if (laborOld > 2) {
            bondForYear = salary * 0.20;
        }

        if (salary > 3500) {
            bondForSalary = salary * 0.10;
        } else if (salary > 1000) {
            bondForSalary = salary * 0.15;
        } else {
            bondForSalary = salary * 0.25;
        }
        if (bondForYear > bondForSalary) {
            mayorBono = bondForYear;
        } else {
            mayorBono = bondForSalary;
        }

        System.out.println("El bono de mayor valor es:" + mayorBono);


    }
}
