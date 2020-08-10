package ar.com.ada.online.second.exerciseninebis;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class Main {

    public static void main(String[] args) {
        // titulo el programa y declaro las variables
        // identar codigo ctrl + alt + l

        System.out.println("Programa para determinar cuánto le cuesta a una persona contratar una\n" +
                "póliza.");
        System.out.println("************************************************************************");

        String typeOfInsurancePolicy; //tipo de poliza
        double initialPrice;
        double additional;
        double finalPrice = 0;
        boolean answer; //no es necesario igual a TRUE

        //metodo para que ingrese los datos por teclado
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese tipo de poliza: A o B");
        typeOfInsurancePolicy = keyboard.next();

        // switch para establecer que tipo de poliza ingresa el usuario
        switch (typeOfInsurancePolicy) {
            case "A":
                initialPrice = 1200;
                break;
            case "B":
                initialPrice = 950;
                break;
            default:
                initialPrice = 0; // INICIALIZAR LA VARIABLE PARA QUE COMPILE
                System.out.println("Ingrese tipo de poliza válida");
                System.exit(0); // DA LA ORDEN QUE NO CONTINUE EL PROGRAMA EN EJECUCION
        }

        //metodo de control para designar el precio de la poliza
        finalPrice = initialPrice; // igualo las variables para poder reutilizar e ir sumando los porcentajes

        System.out.println("Por favor ingrese respuesta como TRUE o FALSE");

        System.out.println("¿Bebe alcohol?");
        answer = keyboard.nextBoolean();
        if (answer) {//ingresa la respuesta verdadera
            additional = initialPrice * 0.05;
            finalPrice = finalPrice + additional;
        } /*else {
            initialPrice = finalPrice;
        }*/ // NO ES NECESARIO EN ESTE CASO CODIFICAR ELSE PORQUE AL INICIO YA ESTAMOS DECLARANDO QUE INITIALPRICE = FINALPRICE

        System.out.println("¿Usa lentes?");
        answer = keyboard.nextBoolean();
        if (answer) {//pregunta si es TRUE, si se cumple ejecuta la instruccion, sino initialprice=finalprice
            additional = initialPrice * 0.05;
            finalPrice = finalPrice + additional;
        }

        System.out.println("¿Tiene alguna enfermedad pre-existente como diabetes o deficiencia cardiaca?");
        answer = keyboard.nextBoolean();
        if (answer) {//pregunta si es TRUE, si se cumple ejecuta la instruccion, sino initialprice=finalprice
            additional = initialPrice * 0.05;
            finalPrice = finalPrice + additional;
        }

        System.out.println("¿Tiene mas de 40 años?");
        answer = keyboard.nextBoolean();
        if (answer) {//pregunta si es TRUE, si se cumple ejecuta la instruccion, sino ejecuta la parte false ELSE IF
            additional = initialPrice * 0.20;
            finalPrice = finalPrice + additional;
        } else {
            additional = initialPrice * 0.10;
            finalPrice = finalPrice + additional;
        }
        System.out.println("El precio de la poliza es:" + finalPrice);


    }
}
