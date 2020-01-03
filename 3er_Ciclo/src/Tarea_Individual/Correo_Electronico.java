package Tarea_Individual;

/*Crear un proyecto que utilizando joptionpane.showmessagedialog, reciba texto que sea correo electrónico, y
a este texto lo cuente, verifique que solo exista un arroba y si hay más lance una exception, y 
después del arroba exista hasta dos  punto y si hay más lance otra exception */

import javax.swing.JOptionPane;

public class Correo_Electronico {

    public static void main(String[] args) {
        int numero = 0;
        String cadena;
        char caracteres = 0;
        String frace = "";
        char arroba = '@';

        cadena = JOptionPane.showInputDialog("Digita tu correo electronico");

        for (int i = 0; i < cadena.length(); i++) {

            caracteres = cadena.charAt(i);

            frace = frace + caracteres;

            if (cadena.charAt(i) == arroba) {

                numero++;

            }

        }
        JOptionPane.showMessageDialog(null, numero);
    }

}
