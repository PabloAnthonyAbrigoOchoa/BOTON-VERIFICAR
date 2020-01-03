package Ejemplo;

public abstract class Animal extends Ser_vivo implements Acciones, Eventos {

    @Override
    public void desplazarse() {
        System.out.println("El animal se desplaza en 4 patas");

    }

    @Override
    public void trabajar() {
        System.out.println("");
    }

    public void jugar() {
        System.out.println("");

    }

    public abstract void alimentarse();
}
