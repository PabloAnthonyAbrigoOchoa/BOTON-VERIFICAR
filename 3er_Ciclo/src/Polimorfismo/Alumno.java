package Polimorfismo;

public class Alumno extends Persona {

    private String cod_alumno;
    private double calificación;

    public Alumno() {
    }
    
    public Alumno(String cod_alumno, double calificación, String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
        this.cod_alumno = cod_alumno;
        this.calificación = calificación;
    }

    public String getCod_alumno() {
        return cod_alumno;
    }

    public void setCod_alumno(String cod_alumno) {
        this.cod_alumno = cod_alumno;
    }

    public double getCalificación() {
        return calificación;
    }

    public void setCalificación(double calificación) {
        this.calificación = calificación;
    }

    public void estudiar (){
        System.out.println("Me gusta la programacion");
        
    
}
    
}
