package Ejemplo;
public class Humano implements Acciones{

    @Override
    public void desplazarse() {
        System.out.println("El humano camina en 2 patas");
    } 

    @Override
    public void trabajar() {
    }
}
