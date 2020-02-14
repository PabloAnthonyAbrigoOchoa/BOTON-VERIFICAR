package trabajo_grupal;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pantalla_principal extends JFrame {

    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();
    JPanel pan3 = new JPanel();
    JTextArea are1 = new JTextArea();
    JLabel lab1 = new JLabel();
    ArrayList<String> nombreArrayList = new ArrayList<String>();

    public Pantalla_principal() {
        setSize(600, 600);
        setTitle("Principal_pantalla");
        setLocation(500, 500);
        agregarcomponentes();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ArrayList Lista_nombres = new ArrayList(3);
        System.out.println("Tamaño de ArrayList en la creación:" + Lista_nombres.size()); 
        Lista_nombres.add("Facebook"); 
        Lista_nombres.add("Whatsapp"); 
        Lista_nombres.add("Instagram"); 
        Lista_nombres.add("Twiter");  
 
       
    }

//    private DefaultListModel R_sociales() {
//        DefaultListModel model = new DefaultListModel<>();
//        model.addElement("Whatsapp");
//        model.addElement("Instagram");
//        model.addElement("Facebook");
//        model.addElement("Twiter");
//        return model;
//    }

    
    public void agregarcomponentes() {
        getContentPane().add(pan1);
        pan1.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
       
    }

    public static void main(String[] args) {
        Pantalla_principal p = new Pantalla_principal();

    }
}

//como cargar la imagen 
//New ImagenIcon(getClass().getResources("img/"))