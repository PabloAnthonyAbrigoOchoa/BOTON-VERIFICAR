package Polimorfismo;

public class Ejecutar {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        alumno1.comer();

        Docente docente1 = new Docente();
        docente1.enseñar();

        Persona objeto1 = new Persona("Lolo", "Hernandez", 15, "111658222");

        Alumno objeto2 = new Alumno("524", 15.5, "Manuel", "Ordonez", 35, "5161686161");

        Docente objeto3 = new Docente(15.4, "Ale", "Mortiño", 49, "642646464657");

        System.out.println(objeto1);
        System.out.println(objeto2);
        System.out.println(objeto3);
    }

}
