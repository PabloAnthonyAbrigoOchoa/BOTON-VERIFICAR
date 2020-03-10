package Modelo;

public class Alumno {

    private String nombre, apellido, direccion, telefono, correo, edad, fec_nacimiento;
    private String cedula;

    public String getFec_nacimiento() {
        return fec_nacimiento;
    }

    public void setFec_nacimiento(String fec_nacimiento) {
        this.fec_nacimiento = fec_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    String getTeléfono() {
        return null;

    }

    void setNombres(String nom) {

    }

    void setApellidos(String ape) {

    }

    void setCarrera(String car) {

    }

    void setModulo(String mod) {

    }
}
