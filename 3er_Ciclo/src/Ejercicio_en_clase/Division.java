package Ejercicio_en_clase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    int dividendo, divisor, resultado;

    public Division() {
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividiendo(int dividiendo) {
        this.dividendo = dividiendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void leer() {
        Scanner p = new Scanner(System.in);
        System.out.println("Ingrese el numero dividendo");
        setDividiendo(p.nextInt());
        System.out.println("Ingrese el numero divisor");
        setDivisor(p.nextInt());
    }

    public void Division() {
        boolean correcto = false;
        do {
            try {
                leer();
                setResultado(getDividendo() / getDivisor());
                correcto = true;
            } catch (ArithmeticException err) {
                System.out.println("No se puiede dividir para cero....");
            } catch (InputMismatchException e) {
                System.out.println("No se puede ingresar texto....");
            }

        } while (!correcto);

    }

    public String mostrarDatos() {
        return ("El dividendo es: " + getDividendo()+ 
                "\n El divisor es: " + getDivisor()+
                "\n El resultado es:  " + getResultado());
    }
}
