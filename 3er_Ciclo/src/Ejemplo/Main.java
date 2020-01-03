package Ejemplo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Humano h = new Humano();
        Animal_hervivoro a = new Animal_hervivoro();

        h.desplazarse();
        a.desplazarse();
        a.dormir();

    }
}
