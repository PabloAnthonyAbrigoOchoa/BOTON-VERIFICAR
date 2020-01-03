package Polimorfismo2;

public class Vehiculo_Furgoneta extends Vehículo {

    //CLASE HIJA
    private int carga;

    public Vehiculo_Furgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo
                + "\ncarga: " + carga;
    }

}
