package ecepciones;

import java.util.InputMismatchException;

public class dividir {

    static int a = 9;
    static int b = 0;
    double di;

    public static void main(String[] args) {

        try {
            divi(a, b);
        } catch (InputMismatchException e) {
            System.out.println("formato incorrecto" + e.getLocalizedMessage());
        } catch (NumberFormatException e) {
            System.out.println("dividir para cero"+ e.toString());
        }finally{
            System.out.println("ingreso al finally");
        }

    }

    public static void divi(int c, int d) {

        System.out.println("" + c / d);

    }
}
