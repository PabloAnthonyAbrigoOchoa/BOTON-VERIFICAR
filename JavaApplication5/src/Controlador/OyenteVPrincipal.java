package Controlador;

import Vista.VAleatorioAlumnos;
import Vista.VCrearAlumnos;
import Vista.VPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteVPrincipal implements ActionListener {

    VPrincipal vp;

    public OyenteVPrincipal(VPrincipal vp) {
        this.vp = vp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vp.getMiSalir()) {
            System.exit(0);
        }
        if (e.getSource() == vp.getMiAleatorio()) {
            new VAleatorioAlumnos();
        }
        if (e.getSource() == vp.getMiCrear()) {
            new VCrearAlumnos();

        }
    }
}
