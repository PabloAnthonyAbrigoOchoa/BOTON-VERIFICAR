package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoBD;
import Vista.VCrearAlumnos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteVerificarAlumno implements ActionListener {

    VCrearAlumnos vca;
    AlumnoBD abd;
    Alumno a;

    public OyenteVerificarAlumno(VCrearAlumnos vca) {
        this.vca = vca;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vca.limipiarCampos();
        vca.bloquear();
        vca.desbloquear();
        
     
    }

}


