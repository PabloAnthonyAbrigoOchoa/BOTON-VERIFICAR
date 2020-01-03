package Tarea_Individual;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int cant_Arroba;
        String cadena;
        String mensaje;
        boolean ciclo = true;
        final char arroba = '@';

        while (ciclo) {

            cant_Arroba = 0;

            cadena = JOptionPane.showInputDialog("Digita tu correo electronico");

            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == arroba) {
                    cant_Arroba++;
                }
            }

            if (cant_Arroba != 1) {
                mensaje = "incorrecto";
            } else {
                mensaje = "correcto";
                ciclo = false;
            }

            JOptionPane.showMessageDialog(null, mensaje);

        }

    }

}
