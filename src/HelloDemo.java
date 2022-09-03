import javax.swing.*; //no se deberia de agregar el astrerisco porq agarra toda la libreria, eso es inseguro
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo extends JFrame { //Jframe es el contenedor, y hello demos y lo que contiene adquiere funcionalidad, es el administrador de la ventana

    private JPanel pnelMain;
    private JTextField txt;
    private JButton clickMeButton;

    public HelloDemo() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(clickMeButton,txt.getText());//el dialogo es que sobrepone encima de la pantalla
                //y no se puede usar lo demas hasta que se salga de la pantalla
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        HelloDemo h = new HelloDemo();
        h.setContentPane(h.pnelMain); //todo esto se puede cambiar en el form, pero aqui nos muestran que puede ser dinamico
        h.setTitle("Hello");
        h.setSize(300,400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//le decimos que el frame se sale como el objeto
        //lo indica, no como esta por default
    }
}


