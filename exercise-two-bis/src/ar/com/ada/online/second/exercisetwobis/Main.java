package ar.com.ada.online.second.exercisetwobis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaro las variables y titulo el programa
        System.out.println("Programa para determinar el sueldo semanal de un trabajador con base en\n" +
                "las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada\n" +
                "hora se considera como excedente y se paga el doble");
        System.out.println("******************************************************************************");

        double hoursWorked;
        double hoursDoubleWorked;
        final double VALUE_HOUR_WORKED = 100;
        final double VALUE_HOURS_DOUBLE_WORKED = 200;
        double salaryHoursWorked;
        double payHoursDoubleWorked;
        double salaryHoursExtras;

        //metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese horas trabajadas:");
        hoursWorked = keyboard.nextDouble();

        //estructura de control
        if (hoursWorked < 40) {
            salaryHoursWorked = hoursWorked * VALUE_HOUR_WORKED;
            System.out.println("El salario de horas normales es:" + salaryHoursWorked);

        } else {
            hoursDoubleWorked = hoursWorked - 40;
            payHoursDoubleWorked = hoursDoubleWorked * VALUE_HOURS_DOUBLE_WORKED;
            salaryHoursWorked = 40 * VALUE_HOUR_WORKED;
            salaryHoursExtras = payHoursDoubleWorked + salaryHoursWorked;
            System.out.println("Salario con horas extras es:" + salaryHoursExtras);

        }
    }
}
