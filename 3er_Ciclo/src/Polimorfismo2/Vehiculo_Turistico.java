package Polimorfismo2;

public class Vehiculo_Turistico extends Vehículo {

    //CLASE HIJA
    private int Numero_puertas;

    public Vehiculo_Turistico(int Numero_puertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.Numero_puertas = Numero_puertas;
    }

    public int getNumero_puertas() {
        return Numero_puertas;
    }

    //Sobre escribo el metodo
    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo
                + "\nNumero puertas: " + Numero_puertas;

    }

}
