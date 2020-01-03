package Polimorfismo2;

public class Ejecutar {
    //CREE UN ARREGLO DE VEHÍCULOS

    public static void main(String[] args) {

        Vehículo misVehiculos[] = new Vehículo[4];
        //AQUI EXISTE EL POLIMORFISMO YA QUE UN OBJETO DE LA CLASE PADRE GUARDA LA INSTANCIACION DE UNA CLASE HIJA
        misVehiculos[0] = new Vehículo("JUI8", "LAMBORGINI", "S32");
        misVehiculos[1] = new Vehiculo_Turistico(5, "HF67", "FERRARY", "LTT90");
        misVehiculos[2] = new Vehiculo_Deportivo(4544, "UAAU", "PORCH", "III30");
        misVehiculos[2] = new Vehiculo_Furgoneta(8000, "JI6", "TOYOTA", "JJWQ2");

        for (Vehículo vehiculos : misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}
