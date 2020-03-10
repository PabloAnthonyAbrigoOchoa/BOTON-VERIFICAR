package Vista;

import Controlador.OyenteCrearAlumno;
import Modelo.Alumno;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VCrearAlumnos {

    JFrame ventana = new JFrame("Registro Estudiantes");

    JPanel panel = new JPanel();
    //CREO UN TEXTFIELD PARA EL ANCHO DEL CONTENIDO DE ESPACIO
    JTextField texto1 = new JTextField(10);
    JTextField texto2 = new JTextField(10);
    JTextField texto3 = new JTextField(10);
    JTextField texto4 = new JTextField(10);
    JTextField texto5 = new JTextField(10);
    JTextField texto6 = new JTextField(10);
    JTextField texto7 = new JTextField(10);
    private Alumno alumno = new Alumno();
    //CREO UN JLABEL PARA PODER INGRESAR LOS DATOS
    JLabel nombres = new JLabel("Nombre:  ");
    JLabel apellidos = new JLabel("Apellido:  ");
    JLabel num_cedula = new JLabel("Cédula:  ");
    JLabel edad = new JLabel("Edad:  ");
    JLabel fec_nacimiento = new JLabel("Fecha de Nacimiento:  ");
    JLabel direccion = new JLabel("Dirección:  ");
    JLabel telefono = new JLabel("Teléfono:  ");
    //CREO UN JBUTTON PARA MOSTRAR LOS BOTONES 
    JButton b_guardar = new JButton("Guardar ");
    JButton b_eliminar = new JButton("Eliminar ");
    JButton b_cancelar = new JButton("Cancelar ");
    JButton b_verificar = new JButton("Verificar");

    public VCrearAlumnos() {
        ventana.setSize(400, 500);
        ventana.setLocation(100, 100);
        crearComponentes();
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Formulario de Registro");

    }

    public void crearComponentes() {
        ventana.getContentPane().add(panel);
        panel.setBackground(Color.YELLOW);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints contenedor1 = new GridBagConstraints();

        //FIJAR EL PRIMER JLABEL Y EL JTEXTFIELD
        contenedor1.gridx = 0;
        contenedor1.gridy = 0;
        contenedor1.insets = new Insets(10, 10, 10, 10);
        panel.add(nombres, contenedor1);
        contenedor1.gridx = 1;
        contenedor1.gridy = 0;
        panel.add(texto1, contenedor1);
        contenedor1.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor2 = new GridBagConstraints();
        contenedor2.gridx = 0;
        contenedor2.gridy = 1;
        contenedor2.insets = new Insets(10, 10, 10, 10);
        panel.add(apellidos, contenedor2);
        contenedor2.gridx = 1;
        contenedor2.gridy = 1;
        panel.add(texto2, contenedor2);
        contenedor2.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor3 = new GridBagConstraints();
        contenedor3.gridx = 0;
        contenedor3.gridy = 2;
        contenedor3.insets = new Insets(10, 10, 10, 10);
        panel.add(num_cedula, contenedor3);
        contenedor3.gridx = 1;
        contenedor3.gridy = 2;
        panel.add(texto3, contenedor3);
        contenedor3.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor4 = new GridBagConstraints();
        contenedor4.gridx = 0;
        contenedor4.gridy = 3;
        contenedor4.insets = new Insets(10, 10, 10, 10);
        panel.add(edad, contenedor4);
        contenedor4.gridx = 1;
        contenedor4.gridy = 3;
        panel.add(texto4, contenedor4);
        contenedor4.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor5 = new GridBagConstraints();
        contenedor5.gridx = 0;
        contenedor5.gridy = 4;
        contenedor5.insets = new Insets(10, 10, 10, 10);
        panel.add(fec_nacimiento, contenedor5);
        contenedor5.gridx = 1;
        contenedor5.gridy = 4;
        panel.add(texto5, contenedor5);
        contenedor5.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor6 = new GridBagConstraints();
        contenedor6.gridx = 0;
        contenedor6.gridy = 5;
        contenedor6.insets = new Insets(10, 10, 10, 10);
        panel.add(direccion, contenedor6);
        contenedor6.gridx = 1;
        contenedor6.gridy = 5;
        panel.add(texto6, contenedor6);
        contenedor6.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor7 = new GridBagConstraints();
        contenedor7.gridx = 0;
        contenedor7.gridy = 6;
        contenedor7.insets = new Insets(10, 10, 10, 10);
        panel.add(telefono, contenedor7);
        contenedor7.gridx = 1;
        contenedor7.gridy = 6;
        panel.add(texto7, contenedor7);
        contenedor7.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints g_boton = new GridBagConstraints();
        g_boton.gridy = 0;
        g_boton.gridy = 8;
        panel.add(b_guardar, g_boton);

        g_boton.gridy = 1;
        g_boton.gridy = 8;
        panel.add(b_eliminar, g_boton);

        g_boton.gridy = 2;
        g_boton.gridy = 8;
        panel.add(b_cancelar, g_boton);

        g_boton.gridy = 2;
        g_boton.gridy = 0;
        panel.add(b_verificar, g_boton);

        GridBagConstraints g_combo1 = new GridBagConstraints();
        Vector v = new Vector();
        v.addElement("SELECCIONAR");
        b_guardar.addActionListener(new OyenteCrearAlumno(this));
    }

    public Alumno guardarAlumno() {

        alumno.setCedula(texto3.getText());
        alumno.setNombre(texto1.getText());
        alumno.setApellido(texto2.getText());
        alumno.setEdad(texto4.getText());
        alumno.setFec_nacimiento(texto6.getText());
        alumno.setTelefono(texto7.getText());

        return alumno;
    }

    public void limipiarCampos() {
        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");

    }

    public static Alumno buscarAlumno() {
        return null;

    }

    public void bloquear() {
        texto1.setEditable(false);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);

    }

    public void desbloquear() {
        texto1.setEnabled(false);
        texto2.setEnabled(false);
        texto3.setEnabled(false);
        texto4.setEnabled(false);
        texto5.setEnabled(false);
        texto6.setEnabled(false);
        texto7.setEnabled(false);

    }
    

    public static void main(String[] args) {
        VCrearAlumnos fe = new VCrearAlumnos();
    }

}
