import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    showMessageDialog(frame, panel);
    showInputDialog(frame, "What's your name?"); 
    System.exit(0);
  }
}
