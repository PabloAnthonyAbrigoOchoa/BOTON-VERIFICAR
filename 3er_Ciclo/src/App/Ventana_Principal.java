package App;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana_Principal extends JFrame {

    JPanel p = new JPanel();
    JLabel l = new JLabel("!JUGUEMOOOS¡ ¿Escoge lo que quieres adivinar?");
    JButton b = new JButton("CHEQUEAR");
    JTextField t = new JTextField(15);
    Ventana_Resultado q;
    JComboBox cb;

    public Ventana_Principal() {
        super("Ventana_Principal");
        setLocation(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentes();
        pack(); //acoplar al tamaño de la pantalla

    }

    public void agregarComponentes() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.insets = new Insets(10, 10, 10, 10); //espacio de 10 pixeles en la pantalla
        p.add(l, g);
        g.gridy = 1;
        p.add(t, g);
        Vector v = new Vector(6);
        v.addElement("Numero de la semana");
        v.addElement("Día del año");
        v.add("Dia del mes");
        v.add("Dia de la semana"); //EMPIEZA A CONTAR DESDE EL DOMINGO 
        cb = new JComboBox(v);
        g.gridx = 1;
        p.add(cb, g);
        g.gridy = 2;
        g.gridx = 0;
        p.add(b, g);
        b.addActionListener(new ActionListener() { //PARA DETECTAR EL CLIC DEL BOTÓN
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!t.getText().isEmpty()) {
                    chequear();

                } else {
                    JOptionPane.showMessageDialog(null, "Inserte texto para empezar a jugar");
                }
            }
        });

    }

    public void chequear() {
        switch (cb.getSelectedIndex()) {
            case 0:
                try {
                    int text = Integer.parseInt(t.getText());
                    Calendar c = Calendar.getInstance();
                    int ca = c.get(Calendar.WEEK_OF_YEAR);
                    if (text == ca) {
                        q = new Ventana_Resultado();
                        q.lr.setText("Correcto");
                        q.lr.setForeground(Color.blue);
                        q.br.setText("Terminar");
                    } else {
                        q = new Ventana_Resultado();
                        q.lr.setText("Incorrecto");
                        q.lr.setForeground(Color.red);
                        q.br.setText("Terminaste el juego, felicidades");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;
            case 1:
                try {
                    int text = Integer.parseInt(t.getText());
                    Calendar d = Calendar.getInstance();
                    int r = d.get(Calendar.DAY_OF_YEAR);
                    if (text == r) {
                        q = new Ventana_Resultado();
                        q.lr.setText("Correcto");
                        q.lr.setForeground(Color.blue);
                        q.br.setText("Terminar");
                    } else {
                        q = new Ventana_Resultado();
                        q.lr.setText("Incorrecto");
                        q.lr.setForeground(Color.red);
                        q.br.setText("Terminaste el juego, felicidades");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;
            case 2:
                try {
                    int text = Integer.parseInt(t.getText());
                    Calendar e = Calendar.getInstance();
                    int o = e.get(Calendar.DAY_OF_MONTH);
                    if (text == o) {
                        q = new Ventana_Resultado();
                        q.lr.setText("Correcto");
                        q.lr.setForeground(Color.blue);
                        q.br.setText("Terminar");
                    } else {
                        q = new Ventana_Resultado();
                        q.lr.setText("Incorrecto");
                        q.lr.setForeground(Color.red);
                        q.br.setText("Terminaste el juego, felicidades");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;
            case 3:
                try {
                    int text = Integer.parseInt(t.getText());
                    Calendar e = Calendar.getInstance();
                    int o = e.get(Calendar.DAY_OF_WEEK);
                    if (text == o) {
                        q = new Ventana_Resultado();
                        q.lr.setText("Correcto");
                        q.lr.setForeground(Color.blue);
                        q.br.setText("Terminar");
                    } else {
                        q = new Ventana_Resultado();
                        q.lr.setText("Incorrecto");
                        q.lr.setForeground(Color.red);
                        q.br.setText("Terminaste el juego, felicidades");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;

        }

    }

}

//Segunda_forma
//    public int chequearMes (int a) {
//        int c = 0;
//        if (a == 0) {
//            Calendar ca = Calendar.getInstance();
//            c = ca.get(Calendar.WEEK_OF_YEAR);
//        }
//        if (a == 1) {
//            Calendar cal = Calendar.getInstance();
//            c = cal.get(Calendar.DAY_OF_MONTH);
//        }
//        return c;
//
//    }
//    public int comprobarAño (int b){
//        int d=0;
//        if (b == 0){
//            Calendar cl = Calendar.getInstance();
//            d = cl.get(Calendar.DAY_OF_MONTH);
//            
//        }
//        return d;
//            
//    }

