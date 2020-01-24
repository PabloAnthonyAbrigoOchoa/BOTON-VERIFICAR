package App;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana_Resultado extends JFrame {

    JPanel pr = new JPanel();
    JLabel lr = new JLabel("Texto");
    JButton br = new JButton("Texto");

    public Ventana_Resultado() {
        super("Ventana_Resultado");
        setSize(400, 200);
        setLocation(300, 400);
        agregarComponentes();
        dispose();
        setVisible(true);

    }

    public void agregarComponentes() {
        getContentPane().add(pr);
        pr.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.insets = new Insets(10, 10, 10, 10);
        pr.add(lr, g);
        g.gridy = 1;
        g.gridy = 2;
        pr.add(br, g);
        br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (br.getText() == "Terminar") {
                    System.exit(0);

                } else {
                    dispose();
                }
            }
        });
    }
}
