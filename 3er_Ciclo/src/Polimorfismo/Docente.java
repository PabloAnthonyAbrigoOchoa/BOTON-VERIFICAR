package Polimorfismo;

public class Docente extends Persona {

    private double salario;
    

    public double getSalario() {
        return salario;
    }

    public Docente() {
    }

    

    public Docente(double salario, String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public void enseñar(){
        System.out.println("YO QUIERO ENSEÑAR MATEMATICAS");
        
    }

}
