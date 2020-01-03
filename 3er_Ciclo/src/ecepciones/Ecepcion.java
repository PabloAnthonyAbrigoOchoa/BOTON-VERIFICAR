package ecepciones;

import java.util.Scanner;

public class Ecepcion {

    public static int dividendo;
    public static int divisor;
    public static double resultado;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        dividendo = sc.nextInt();
        System.out.println("Ingresar otro numero");
        divisor = sc.nextInt();
        System.out.println("resultado es: ");
        dividir();
        resultado = dividendo / divisor;

    }

    public static void dividir() {
        try {
            if (divisor == 0) {
                throw new IllegalArgumentException("No se puede dividir por cero");
            }
            System.out.println(dividendo / divisor);
        } catch (IllegalArgumentException e) {
            System.err.println(e+"Hola mundo");// también podría poner e.getMessage()
        }

    }
}
