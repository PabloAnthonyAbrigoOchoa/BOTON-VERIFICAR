package Tarea_formulario_face;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Ventana extends JFrame {

    JFrame v = new JFrame();
    JPanel p = new JPanel();
    JButton b = new JButton("ACEPTAR");
    JLabel l = new JLabel("Facebook");
    JLabel la = new JLabel("contraseña", SwingConstants.CENTER);
    JLabel q = new JLabel("correo electronico o telefono");
    JTextField t = new JTextField(10);
    JTextField t1 = new JTextField(20);

    public Ventana() {
        setSize(600, 600); //Establezco el tamaño de la ventana
        setTitle("Facebook");//Establezco el titulo de la ventana
        //setLocation(350,50); //Establezco la posicion inicial de la ventana
        //setBounds(350, 50, 600, 600); //Establezco la posición inicial y el tamaño de la ventana
        setLocationRelativeTo(null); //Establezco la ventana en el centro
        setBackground(Color.BLUE);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //cierro el programa
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2));
        FlowLayout layout = new FlowLayout();
        JPanel p2 = new JPanel();
        p2.setLayout(layout);
        JLabel one, two, three, four, five;
        JTextField tname, tsalary, tcode, tdesig;
        JButton b = new JButton("Entrar");
        JButton buttonSave, buttonExit;
        one = new JLabel("Correo electrónico o teléfono");
        tname = new JTextField(20);
        two = new JLabel("Contraseña");
        tsalary = new JTextField(20);
        buttonExit = new JButton("Registrarte");
        p.add(b);
        p1.add(one);
        p1.add(tname);
        p1.add(two);
        p1.add(tsalary);
        p2.add(buttonExit);
        add(p1, "North");
        add(p2, "South");
        setVisible(true);
        this.setSize(400, 180);
    }

    public void agregarComponentes() {
        v.getContentPane().add(p);
        p.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        p.setBackground(Color.white);//color al fondo de la ventana
        l.setForeground(Color.BLUE);//color al texto

        t1.setEditable(false);
        p.add(q);
        p.add(la);
        p.add(l);
        p.add(t);
        p.add(b);
        p.add(t1);
        p.add(la);

    }

}
