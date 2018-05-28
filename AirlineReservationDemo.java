import javax.swing.*;
import java.awt.*;
 
public class AirlineReservationDemo {
 
 private static void createAndShowUI()
 {
      
        JPanel panel = new JPanel();
 
        FirstProject project = new FirstProject();
        JTabbedPane tab = new JTabbedPane();
        JFrame frame = new JFrame("Airline");
        tab.add("FirstProject", project);
        frame.add(tab, BorderLayout.CENTER);
        frame.setSize(800,500);
        frame.setVisible(true);
  }
    public static void main(String[] args) 
    {
         
       java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            createAndShowUI();
         }
      });
 
    }
 
}