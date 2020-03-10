package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoBD;
import Vista.VCrearAlumnos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteCrearAlumno implements ActionListener {

    VCrearAlumnos vca;
    AlumnoBD abd;
    Alumno a;

    public OyenteCrearAlumno(VCrearAlumnos vca) {
        this.vca = vca;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //De la vista recibo un alumno
        a = vca.guardarAlumno();
        //En la base de datos envio un alumno a guardar
        abd.guardarAlumnoBD(a);
        vca.limipiarCampos();
        vca.bloquear();
        vca.desbloquear();
        
    }
    
    public void OyenteVerificarAlumno(VCrearAlumnos vca) {
       vca.bloquear();
       vca.desbloquear();
       
    }
    
    

}
