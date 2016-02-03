
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTextArea;

public class GUI
{
  public static void main(String[] args)
  {
    

// create a simple jpanel
    JPanel panel = new JPanel();
    panel.setBackground(Color.BLUE);
    panel.setMinimumSize(new Dimension(200,200));
     
    // display the jpanel in a joptionpane dialog, using showMessageDialog
    JFrame frame = new JFrame("JOptionPane showMessageDialog component example");
    JOptionPane.showMessageDialog(frame, panel);
    System.exit(0);
    
 JFrame ventana= new JFrame("COmponentes");
frame.setBounds(10,10,600,600);
frame.setVisible(true);
frame.setTitle("Componentes de una interfaz");
frame.setResizable(false); 


JTextField caja= new JTextField("JTextField");
caja.setBounds(60,15,150,20);
frame.add(caja);

JTextArea Area= new JTextArea();
Area.setBounds(100,110,23,300);
Area.setVisible(true);
frame.add(Area);


JToolBar barra = new JToolBar("barra");
 barra.add(caja);
 frame.getContentPane().add(barra); 
 barra.setVisible(true);

}
  
}
