package ar.com.ada.online.second.exercisesixbis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // titulo el programa y declaro las variables

        // ctrl + alt + l para ordenar el codigo

        System.out.println("Programa para determinar\n" + "el costo y el descuento que tendrá un artículo ");

        double price;
        double discount;
        double priceWhitDiscount;

        //metodo para solicitar datos por teclado
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese precio:");
        price = keyboard.nextDouble();

        //estructura de control

        if (price >= 200) {
            discount = price * 0.15;
            priceWhitDiscount = price - discount;
        } else if (price >= 100) {
            discount = price * 0.12;
            priceWhitDiscount = price - discount;

        } else {
            discount = price * 0.10;
            priceWhitDiscount = price - discount;
        }
        //printf para formatear los decimales  %5.2f, variables
        System.out.printf("El precio final es:\n $%5.2f " + "\n" + "el descuento obtenido es:\n $%5.2f", priceWhitDiscount, discount);

    }
}
