package Modelo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlumnoBD {

    Alumno estudiante;
    private static ArrayList<Alumno> listaE;

    public static void guardarAlumnoBD(Alumno alumno) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumno", "root", "ROOT");
            System.out.print("Conexion establecida!");

            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into estudiante values('" + alumno.getCedula()
                    + "','" + alumno.getNombre() + "','" + alumno.getApellido() + "','" + alumno.getEdad() + "','"
                    + alumno.getCorreo() + "','" + alumno.getFec_nacimiento() + "'");
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }

    }

    public static void guardar(String cedula) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/alumno", "root", "");
            System.out.println("Conexion Establecida");
        } catch (Exception e) {
        }

    }

    public static void eliminar(String cedula) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/alumno", "root", "");
            System.out.print("Conexion Establecida");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from estudiante where cedula = '" + cedula + "'");
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }

    public static ArrayList cargar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/alumno", "root", "");
            System.out.print("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from estudiante");
            Alumno estudiante;
            listaE = new ArrayList<>();
            while (necesario.next()) {
                String ced = necesario.getString("cedula");
                String nom = necesario.getString("nombres");
                String ape = necesario.getString("apellidos");
                String car = necesario.getString("carrera");
                String mod = necesario.getString("modulo");
                String tel = necesario.getString("telefono");
                estudiante = new Alumno();
                estudiante.setCedula(ced);
                estudiante.setNombres(nom);
                estudiante.setApellidos(ape);
                estudiante.setCarrera(car);
                estudiante.setModulo(mod);
                estudiante.setTelefono(tel);

                listaE.add(estudiante);
            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return listaE;

    }

    public static Object buscarAlumno(String cedula) {
        AlumnoBD r = new AlumnoBD();
        listaE = new ArrayList<>();
        listaE = r.cargar();
        for (int i = 0; i < listaE.size(); i++) {
            Alumno con = (Alumno) listaE.get(i);
            if (con.getCedula().equals(cedula)) {
                return con;
            }
        }
        return null;
    }
    public static Object verificarAlumno(String cedula) {
        AlumnoBD r = new AlumnoBD();
        listaE = new ArrayList<>();
        listaE = r.cargar();
        for (int i = 0; i < listaE.size(); i++) {
            Alumno con = (Alumno) listaE.get(i);
            if (con.getCedula().equals(cedula)) {
                return con;
            }
        }
        return null;
    }

}
