package ar.com.ada.online.second.exercisetenbis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // titulo el programa y declaro las variables

        //identar codigo ctrl + alt + l

        System.out.println("Programa para determinar a qué lugar podrá ir de vacaciones una persona");

        double budgetToTravel; // presupuesto para viajar
        final double PRICE_OF_KMS = 100;
        double priceOfTicket;
        double difference;
        String destiny;
        //String message;

        //metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Ingrese los siguientes destinos:  Mexico, Puerto Vallarta, Acapulco, Cancun ");
        destiny = keyboard.nextLine();

        //switch para determinar costo del pasaje
        switch (destiny) {
            case "Mexico":
                priceOfTicket = PRICE_OF_KMS * 750 * 2;
                break;
            case "Puerto Vallarta":
                priceOfTicket = PRICE_OF_KMS * 800 * 2;
                break;
            case "Acapulco":
                priceOfTicket = PRICE_OF_KMS * 1200 * 2;
                break;
            case "Cancun":
                priceOfTicket = PRICE_OF_KMS * 1800 * 2;
                break;
            default:
                priceOfTicket = 0;
                System.out.println("Ingresó opcion inválida, por favor ingrese un destino valido");
                System.exit(0);

        }
//estructura de control para determinar si el presupuesto cubre el costo del pasaje
        System.out.println("Ingrese presupuesto para viajar:");
        budgetToTravel = keyboard.nextDouble();

        if (budgetToTravel >= priceOfTicket) {
            //essage = "Puede hacer el viaje";
            System.out.println("Puede hacer el viaje a:" + destiny);

        } else {
            //System.out.println("El presupesto no le permite hacer el viaje a:" + destiny);
            difference = priceOfTicket - budgetToTravel;
            System.out.println("El presupesto no le permite hacer el viaje a:" + destiny + "\n" + "Debe pagar una diferencia de:" + difference);


        }


    }
}
