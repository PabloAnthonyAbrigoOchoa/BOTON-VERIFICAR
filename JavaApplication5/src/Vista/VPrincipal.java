package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VPrincipal {

    JFrame f = new JFrame();
    JMenuBar jmb = new JMenuBar();
    JMenu menu1;
    JMenuItem miCrear, miAleatorio, miSalir;

    public VPrincipal() {
        f.setTitle("Ventana Principal");
        f.setSize(500, 450);
        f.setLocation(200, 200);
        iniciarComponentes();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class OyenteVentanaPrincipal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == miSalir) {
                System.exit(0);
            }
            if (e.getSource() == miAleatorio) {
                new VAleatorioAlumnos();

            }
            if (e.getSource() == miCrear) {
                new VCrearAlumnos();

            }
        }
    }

    private void iniciarComponentes() {

        f.setJMenuBar(jmb);
        menu1 = new JMenu("Alumnos");
        jmb.add(menu1);

        miCrear = new JMenuItem("Crear Alumnos");
        miCrear.addActionListener(new OyenteVentanaPrincipal());
        menu1.add(miCrear);

        miAleatorio = new JMenuItem("Aleatorio Alumnos");
        miAleatorio.addActionListener(new OyenteVentanaPrincipal());
        menu1.add(miAleatorio);

        miSalir = new JMenuItem("Salir");
        miSalir.addActionListener(new OyenteVentanaPrincipal());
        menu1.add(miSalir);

    }

    public Object getMiSalir() {
        return null;

    }

    public Object getMiAleatorio() {
        return null;

    }

    public Object getMiCrear() {
        return null;

    }

}
