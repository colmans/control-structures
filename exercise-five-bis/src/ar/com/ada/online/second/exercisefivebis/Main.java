package ar.com.ada.online.second.exercisefivebis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // tiutlo el programa y declaro las variables
        System.out.println("Programa para determinar en base a tres personas el nombre y la edad de la\n" +
                "persona de menor edad");
        System.out.println("****************************************************************************");

        String nameOne;
        int numberOne;
        String nameTwo;
        int numberTwo;
        String nameThree;
        int numberThree;

        //metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese primer nombre:");
        nameOne = keyboard.next();
        System.out.println("Ingrese primera edad:");
        numberOne = keyboard.nextInt();

        System.out.println("Ingrese segundo nombre:");
        nameTwo = keyboard.next();
        System.out.println("Ingrese segunda edad:");
        numberTwo = keyboard.nextInt();

        System.out.println("Ingrese tercer nombre:");
        nameThree = keyboard.next();
        System.out.println("Ingrese tercera edad:");
        numberThree = keyboard.nextInt();

        //estructura de control
        if (numberOne < numberTwo && numberOne < numberThree) {
            System.out.print("El nombre de la persona menor es: " + nameOne +"\n"+ " y su edad: " +  numberOne);
        } else if (numberTwo < numberOne && numberTwo < numberThree) {
            System.out.print("El nombre de la persona menor es: " + nameTwo +"\n"+ "y su edad: " + numberTwo);
        } else {
            System.out.print("El nombre de la perosna menor es: " + nameThree +"\n "+ "y su edad: " + numberThree);
        }

    }
}
