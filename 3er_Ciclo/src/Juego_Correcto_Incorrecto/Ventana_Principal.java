package Juego_Correcto_Incorrecto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import static javafx.scene.input.KeyCode.J;
import static javafx.scene.input.KeyCode.L;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class Ventana_Principal extends JFrame {

    JLabel L = new JLabel("¿Qué numero de semana es?");
    JTextField T = new JTextField(25);
    JButton b = new JButton("CHEQUEAR");
    JPanel p = new JPanel();

    public Ventana_Principal() {
        setSize(600, 500);
        setTitle("Ventana_Principal");
        setLocation(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.blue);
        agregarComponentes();

    }

    public void agregarComponentes() {
        getContentPane().add(p);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = T.getText();
                Calendar c = Calendar.getInstance();
                int w = c.get(Calendar.WEEK_OF_YEAR);
                if (!texto.isEmpty()) {
                    Ventana_Resultado pablo1 = new Ventana_Resultado();
                    pablo1.L.setText("Correcto");

                    //Utilizar un try and catch
                } else {
                    JOptionPane.showMessageDialog(null, "Correcto");
                    JOptionPane.showMessageDialog(null, "Incorrecto");

                }
            }
        });

        getContentPane()
                .add(p);

        p.add(L);

        p.add(T);

        p.add(b);

        p.add(p);
    }

}
