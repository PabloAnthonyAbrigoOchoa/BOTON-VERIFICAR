package Polimorfismo2;

public class Vehiculo_Deportivo extends Vehículo {

    //CLASE HIJA
    private int cilindraje;

    public Vehiculo_Deportivo(int cilindraje, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    @Override
    public String mostrarDatos() {

        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo
                + "\ncilindraje: " + cilindraje;
    }
}
