package Juego_Correcto_Incorrecto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana_Resultado extends JFrame {

    JButton b = new JButton("Continuar");
    JLabel L = new JLabel("Felicidades");
    JTextField T = new JTextField(25);
    JPanel p = new JPanel();

    public Ventana_Resultado() {
        setSize(600, 500);
        setTitle("Ventana_Resultado");
        setLocation(400, 200);
        setVisible(true);
        setBackground(Color.blue);
        agregarComponentes();

    }

    public void agregarComponentes() {
        getContentPane().add(p);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = T.getText();

            }
        });
        getContentPane()
                .add(p);
        p.add(L);
        p.add(b);

    }

    Calendar c = Calendar.getInstance();
    int w = c.get(Calendar.WEEK_OF_YEAR);
}
